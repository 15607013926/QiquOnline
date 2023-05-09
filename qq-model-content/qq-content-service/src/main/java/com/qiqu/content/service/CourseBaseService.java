package com.qiqu.content.service;

import com.qiqu.commons.model.dto.CourseDto;
import com.qiqu.commons.model.dto.PageRequest;
import com.qiqu.commons.model.vo.ResponseResult;
import com.qiqu.content.domain.CourseBase;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程基本信息 服务类
 * </p>
 *
 * @author 12441
 * @since 2023-05-06
 */
public interface CourseBaseService extends IService<CourseBase> {

    ResponseResult findByPage(PageRequest request, CourseDto dto);
}
