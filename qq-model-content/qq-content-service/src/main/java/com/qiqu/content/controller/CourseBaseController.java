package com.qiqu.content.controller;

import com.qiqu.commons.model.dto.CourseDto;
import com.qiqu.commons.model.dto.CourseListRequestDto;
import com.qiqu.commons.model.dto.PageRequest;
import com.qiqu.commons.model.vo.ResponseResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qiqu.content.service.CourseBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程基本信息前端控制器
 * </p>
 *
 * @author 12441
 */
/**
 * <p>
 * 课程基本信息前端控制器
 * </p>
 *
 * @author itheima
 */

@Api(tags = "奇趣Content课程接口")
@Slf4j
@RestController
@RequestMapping("/course")
public class CourseBaseController {

    @Autowired
    private CourseBaseService  courseBaseService;


    // 课程信息分页查询
    @PostMapping("/list")
    public ResponseResult findByPage(@RequestBody CourseListRequestDto courseListRequestDto){
        PageRequest request = courseListRequestDto.getRequest();
        CourseDto dto = courseListRequestDto.getDto();
        return courseBaseService.findByPage(request,dto);
    }
}
