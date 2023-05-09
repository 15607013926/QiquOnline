package com.qiqu.system.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qiqu.commons.constants.UserConstants;
import com.qiqu.commons.enums.ErrorCode;
import com.qiqu.commons.model.dto.LoginDto;
import com.qiqu.commons.model.dto.RegisterDto;
import com.qiqu.commons.model.vo.LoginVo;
import com.qiqu.commons.model.vo.ResponseResult;
import com.qiqu.commons.utils.JwtUtils;
import com.qiqu.system.domain.User;
import com.qiqu.system.mapper.UserMapper;
import com.qiqu.system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiqu.web.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author itheima
 * @since 2023-04-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserMapper userMapper;

    // 用户登录
    @Override
    public ResponseResult login(LoginDto loginDto) {

        // 1.参数非空校验
        String account = loginDto.getAccount();
        String password = loginDto.getPassword();
        if (!StrUtil.isAllNotEmpty(account,password)) {
            throw new BusinessException(ErrorCode.DATAERROR);
        }
        // 2.根据username和utype查询数据库
        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
        qw.eq(User::getAccount,account);
        User user = this.getOne(qw);
        // 3.判断用户是否存在
        if (ObjectUtil.isEmpty(user)) {
            throw new BusinessException(ErrorCode.LOGINERROR);
        }
        System.out.println("CompanyName:"+user.getCompanyName());
        // 4.判断密码是否正确
        password = SecureUtil.md5(password);
        if (!StrUtil.equals(password,user.getPassword())) {
            throw new BusinessException(ErrorCode.LOGINERROR);
        }
        // 5.登录成功制作token
        Map claimMaps = new HashMap<>();
        claimMaps.put("userId",user.getId());
        claimMaps.put("companyId",user.getCompanyId());
        claimMaps.put("companyName",user.getCompanyName());
        String token = JwtUtils.createToken(claimMaps);
        // 6.将user存入redis
        redisTemplate.opsForValue().set(UserConstants.USER_ID + user.getId(), user, Duration.ofHours(3));

        // 7.返回loginVo
        LoginVo loginVo = new LoginVo();
        loginVo.setAccess_token(token);
        loginVo.setUsername(user.getAccount());
        loginVo.setRole(user.getUtype()); // 添加角色信息到 LoginVo


        return ResponseResult.okResult(loginVo);
    }

    //用户注册
    @Override
    public ResponseResult register(RegisterDto registerDto) {
        // 1.参数非空校验
        String account = registerDto.getAccount();
        String password = registerDto.getPassword();
        String utype = registerDto.getUtype();
        if (!StrUtil.isAllNotEmpty(account,password,utype)) {
            throw new BusinessException(ErrorCode.DATAERROR);
        }
        //2.判断是否已经注册
        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
        qw.eq(User::getAccount,account);
        User user = this.getOne(qw);
        // 3.判断用户是否存在
        if (ObjectUtil.isNotEmpty(user)) {
            throw new BusinessException(ErrorCode.REGISTERERROR);
        }
        //3.插入值
        user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setUtype(utype);
        userMapper.insert(user);

        return ResponseResult.okResult(registerDto);
    }

}
