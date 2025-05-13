package org.example.controller;

import org.example.pojo.ClazzStudent;
import org.example.pojo.Result;
import org.example.pojo.jobOption;
import org.example.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/report")
public class ReportController {
    private static final Logger log = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private ReportService reportService;
    @GetMapping("/empJobData")
    public Result getEmpJobData() {
        log.info("获取员工岗位统计数据");
       jobOption jobOption= reportService.getEmpJobData();
        return Result.success(jobOption);
    }

    @GetMapping("/empGenderData")
    public Result  getEmpGenderData() {
        log.info("获取员工性别统计数据");
        List<Map<String,Object>> genderList= reportService.getEmpGenderData();
        return Result.success(genderList);
    }
    @GetMapping("/studentCountData")
    public Result getStudentCountData(){
        log.info("获取班级学生数量统计数据");
        ClazzStudent studentCount= reportService.getStudentCountData();
        return Result.success(studentCount);
    }
    @GetMapping("/studentDegreeData")
    public Result getStudentDegreeData(){
        log.info("获取学生学历统计数据");
        List<Map<String,Object>> degreeList= reportService.getStudentDegreeData();
        return Result.success(degreeList);
    }
}
