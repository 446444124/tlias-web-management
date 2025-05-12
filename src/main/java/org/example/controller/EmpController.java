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
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

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

    @PostMapping
    public Result save(@RequestBody Emp emp){
        log.info("新增员工:{}",emp);
        empService.save(emp);
        return Result.success();
    }

//    @DeleteMapping
//    public Result delete(Integer[] ids){
//        log.info("批量删除:{}", Arrays.toString(ids));
//        return Result.success();
//    }

    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids){
        log.info("批量删除:{}",ids);
        empService.delete(ids);
        return Result.success();
    }

    @GetMapping("/{id}")
    public  Result getInfo(@PathVariable Integer id){
        log.info("根据id查询员工信息:{}",id);
       Emp emp= empService.getInfo(id);
        return Result.success(emp);
    }

    @PutMapping
    public Result updata(@RequestBody Emp emp){
        log.info("修改员工信息:{}",emp);
        empService.update(emp);
        return Result.success();
    }

    @GetMapping("/list")
    public Result getAllEmp(){
        log.info("查询全部员工信息");
        List<Emp> empList = empService.getAllEmp();
        return Result.success(empList);
    }
}
