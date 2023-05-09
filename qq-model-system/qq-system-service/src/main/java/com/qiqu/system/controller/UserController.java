package com.qiqu.system.controller;

import com.qiqu.commons.model.dto.LoginDto;
import com.qiqu.commons.model.dto.RegisterDto;
import com.qiqu.commons.model.vo.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Api(tags = "奇趣System用户接口")
public class UserController {

    @Autowired
    private UserService  userService;

    // 用户登录
    @ApiOperation(value = "登录接口")
    @PostMapping("/login")
    public ResponseResult login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }@PostMapping("/register")
    public ResponseResult register(@RequestBody RegisterDto registerDto){
        System.out.println("======"+registerDto);
        return userService.register(registerDto);
    }
}
