package com.qiqu.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.core.util.StrUtil;
import com.qiqu.commons.model.dto.CourseDto;
import com.qiqu.commons.model.dto.PageRequest;
import com.qiqu.commons.model.vo.CourseBaseVo;
import com.qiqu.commons.model.vo.PageResponseResult;
import com.qiqu.commons.model.vo.ResponseResult;
import com.qiqu.commons.utils.BeanHelper;
import com.qiqu.content.domain.CourseBase;
import com.qiqu.content.mapper.CourseBaseMapper;
import com.qiqu.content.service.CourseBaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程基本信息 服务实现类
 * </p>
 *
 * @author 12441
 * @since 2023-05-06
 */
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBase> implements CourseBaseService {

    // 课程信息分页查询
    @Override
    public ResponseResult findByPage(PageRequest request, CourseDto dto) {
        // 1.构建分页
        Page<CourseBase> page = new Page<>(request.getPageNo(), request.getPageSize());
        // 2.构建条件
        LambdaQueryWrapper<CourseBase> qw = new LambdaQueryWrapper<>();
        // 课程名称
        String courseName = dto.getCourseName();
        qw.like(StrUtil.isNotBlank(courseName), CourseBase::getName, courseName);
        // 课程状态
        String auditStatus = dto.getAuditStatus();
        qw.eq(StrUtil.isNotBlank(auditStatus), CourseBase::getAuditStatus, auditStatus);
        // 课程类型
        String teachmode = dto.getTeachmode();
        qw.eq(StrUtil.isNotBlank(teachmode), CourseBase::getTeachmode, teachmode);
        // 3.执行分页查询
        page = this.page(page, qw);
        // 4.转vo
        List<CourseBase> courseBaseList = page.getRecords();
        List<CourseBaseVo> voList = BeanHelper.copyWithCollection(courseBaseList, CourseBaseVo.class);
        // 5.返回分页结果
        return PageResponseResult.okResult(page.getTotal(), voList);
    }
}
