package org.example.controller;


import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;
import org.example.pojo.PageResult;
import org.example.pojo.Result;
import org.example.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequestMapping("/emps")
@RestController
public class EmpController {
    private static final Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private EmpService empService;
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10")Integer pageSize,
//                       String name, Integer gender,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
//        log.info("分页查询，参数{},{},{},{},{},{}", page, pageSize,name,gender,begin,end);
//         PageResult<Emp> pageResult = empService.page(page, pageSize,name,gender,begin,end);
//         return Result.success(pageResult);
//    }

    @GetMapping
    public Result page(EmpQueryParam empQueryParam) {
        log.info("分页查询:{}",empQueryParam);
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }
}
