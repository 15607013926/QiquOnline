package com.qiqu.basic.service.impl;

import com.qiqu.basic.domain.Category;
import com.qiqu.basic.mapper.CategoryMapper;
import com.qiqu.basic.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程分类 服务实现类
 * </p>
 *
 * @author 12441
 * @since 2023-05-10
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
