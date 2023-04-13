package com.qiqu.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qiqu.system.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 教育机构前端控制器
 * </p>
 *
 * @author itheima
 */
@Slf4j
@RestController
public class CompanyController {

    @Autowired
    private CompanyService  companyService;
}
