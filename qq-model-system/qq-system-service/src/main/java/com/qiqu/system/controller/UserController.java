package com.qiqu.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qiqu.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 用户信息前端控制器
 * </p>
 *
 * @author itheima
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService  userService;
}
