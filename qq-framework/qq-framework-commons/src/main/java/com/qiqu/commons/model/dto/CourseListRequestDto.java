package com.qiqu.commons.model.dto;

import lombok.Data;

/**
 * @Author 12441
 * @Date 2023/5/10 4:51
 * @Version 1.0
 */
@Data
public class CourseListRequestDto {
    private PageRequest request;
    private CourseDto dto;
}
