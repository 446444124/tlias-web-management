package org.example.controller;

import org.example.pojo.*;

import org.example.service.ClazzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{id}")
    public Result delClazzById(@PathVariable Integer id){
        log.info("删除班级:{}",id);
        clazzService.delClazzById(id);
        return Result.success();
    }

    @PostMapping
    public Result addClazz(@RequestBody Clazz clazz){
        log.info("新增班级:{}",clazz);
        clazzService.addClazz(clazz);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getClazzById(@PathVariable Integer id){
        log.info("根据id查询:{}",id);
        return Result.success(clazzService.getClazzById(id));
    }

    @PutMapping
    public Result updateClazz(@RequestBody Clazz clazz){
        log.info("修改班级:{}",clazz);
        clazzService.updateClazz(clazz);
        return Result.success();
    }
}
