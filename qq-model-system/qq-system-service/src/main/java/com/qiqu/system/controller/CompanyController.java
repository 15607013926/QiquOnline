package com.qiqu.system.controller;

import com.qiqu.commons.enums.ErrorCode;
import com.qiqu.commons.model.vo.AuthInfo;
import com.qiqu.commons.model.vo.CompanyVo;
import com.qiqu.commons.model.vo.ResponseResult;
import com.qiqu.commons.utils.AuthInfoHolder;
import com.qiqu.commons.utils.BeanHelper;
import com.qiqu.commons.utils.JwtUtils;
import com.qiqu.system.domain.Company;
import com.qiqu.web.exception.BusinessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
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
@Api(tags = "奇趣System商户接口")
public class CompanyController {

    @Autowired
    private CompanyService  companyService;

    // 机构查询
    @ApiOperation(value = "获取机构信息")
    @GetMapping("/company/mine")
    public ResponseResult mine(){
        // 2.校验token
        // 1.从线程内获取 authInfo
        AuthInfo authInfo = AuthInfoHolder.getAuthInfo();
        // 2.根据企业id查询数据库
        Company company = companyService.getById(authInfo.getCompanyId());
        // 3.封装并返回vo （复制工具类）
        CompanyVo vo = BeanHelper.copyProperties(company, CompanyVo.class);
        return ResponseResult.okResult(vo);
    }
}
