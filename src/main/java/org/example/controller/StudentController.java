package org.example.controller;

import com.github.pagehelper.Page;
import org.example.pojo.PageResult;
import org.example.pojo.Result;
import org.example.pojo.Student;
import org.example.pojo.StudentQueryParam;
import org.example.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;
    @GetMapping
    public Result page(StudentQueryParam studentQueryParam){
        log.info("分页查询:{}",studentQueryParam);
        PageResult<Student> pageResult = studentService.page(studentQueryParam);
        return Result.success(pageResult);
    }
    @PostMapping
    public Result addStudent(@RequestBody Student student){
        log.info("添加学生:{}",student);
        studentService.addStudent(student);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result findStudentById(@PathVariable Integer id){
        log.info("查询学生:{}",id);
        Student student = studentService.findStudentById(id);
        return Result.success(student);
    }
    @PutMapping
    public Result updateStudent(@RequestBody Student student){
        log.info("修改学生:{}",student);
        studentService.updateStudent(student);
        return Result.success();
    }

    @DeleteMapping("/{ids}")
    public Result delStudentByIds(@PathVariable Integer[] ids){
        log.info("删除学生:{}",ids);
        studentService.delStudentByIds(ids);
        return Result.success();
    }
    @PutMapping("/violation/{id}/{score}")
    public Result updateViolation(@PathVariable Integer id,@PathVariable Integer score){
        log.info("修改违规次数");
        studentService.updateViolation(id,score);
        return Result.success();
    }
}
