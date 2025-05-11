package org.example.controller;

import org.example.pojo.*;

import org.example.service.ClazzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/clazzs")
@RestController
public class ClazzController {
    private static final Logger log = LoggerFactory.getLogger(ClazzController.class);
    @Autowired
    private ClazzService clazzService;

    @GetMapping
    public  Result page(ClazzQueryParam clazzQueryParam){
        log.info("分页查询:{}",clazzQueryParam);
        PageResult<Clazz> pageResult = clazzService.page(clazzQueryParam);
        return Result.success(pageResult);
    }
}
