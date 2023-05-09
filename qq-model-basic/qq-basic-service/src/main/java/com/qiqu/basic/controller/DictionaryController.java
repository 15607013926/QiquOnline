package com.qiqu.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qiqu.basic.service.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 数据字典前端控制器
 * </p>
 *
 * @author 12441
 */
@Slf4j
@RestController
public class DictionaryController {

    @Autowired
    private DictionaryService  dictionaryService;
}
