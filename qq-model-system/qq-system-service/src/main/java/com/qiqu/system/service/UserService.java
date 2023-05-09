package com.qiqu.system.service;

import com.qiqu.commons.model.dto.LoginDto;
import com.qiqu.commons.model.dto.RegisterDto;
import com.qiqu.commons.model.vo.ResponseResult;
import com.qiqu.system.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息 服务类
 * </p>
 *
 * @author itheima
 * @since 2023-04-14
 */
public interface UserService extends IService<User> {

    //用户登录
    ResponseResult login(LoginDto loginDto);

    //用户注册
    ResponseResult register(RegisterDto registerDto);
}
