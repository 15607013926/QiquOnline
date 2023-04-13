package com.qiqu.system.service.impl;

import com.qiqu.system.domain.User;
import com.qiqu.system.mapper.UserMapper;
import com.qiqu.system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
