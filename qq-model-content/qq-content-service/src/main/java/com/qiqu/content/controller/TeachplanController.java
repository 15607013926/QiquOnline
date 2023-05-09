package com.qiqu.content.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qiqu.content.service.TeachplanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程计划前端控制器
 * </p>
 *
 * @author 12441
 */
@Slf4j
@RestController
public class TeachplanController {

    @Autowired
    private TeachplanService  teachplanService;
}
