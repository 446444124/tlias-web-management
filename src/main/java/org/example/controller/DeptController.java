package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.annotations.Delete;
import org.example.pojo.Dept;
import org.example.pojo.Result;
import org.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts", method = RequestMethod.GET)
   @GetMapping
    public Result list(){
        System.out.println("查询全部部门数据");
        List<Dept> deptlist =  deptService.findAll();
        return Result.success(deptlist);
    }

   @DeleteMapping
    public Result delete(Integer id){
        System.out.println("根据id删除部门数据"+id);
        deptService.deleteById(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        System.out.println("新增部门:"+dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        System.out.println("根据id查询部门:"+id);
        Dept dept =deptService.getById(id);
        return Result.success(dept);
    }
    @PutMapping
    public Result update(@RequestBody Dept dept){
        System.out.println("修改部门:"+dept);
        deptService.update(dept);
        return Result.success();
    }
}
