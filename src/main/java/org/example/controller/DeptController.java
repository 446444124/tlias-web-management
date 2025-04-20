package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.annotations.Delete;
import org.example.pojo.Dept;
import org.example.pojo.Result;
import org.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts", method = RequestMethod.GET)
   @GetMapping("/depts")
    public Result list(){
        System.out.println("查询全部部门数据");
        List<Dept> deptlist =  deptService.findAll();
        return Result.success(deptlist);
    }

@DeleteMapping("/depts")
    public Result delete(Integer id){
        System.out.println("根据id删除部门数据"+id);
        deptService.deleteById(id);
        return Result.success();
    }
}
