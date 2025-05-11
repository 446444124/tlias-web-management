package org.example.service.impl;

import org.example.mapper.EmpMapper;
import org.example.pojo.jobOption;
import org.example.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private EmpMapper EmpMapper;
    @Override
    public jobOption getEmpJobData() {
        List<Map<String,Object>> list= EmpMapper.countEmpJobData();

        List<Object> jobList=list.stream().map(map->map.get("pos")).toList();
        List<Object> numList=list.stream().map(map->map.get("num")).toList();
        return new jobOption(jobList,numList);
    }

    @Override
    public List<Map<String, Object>> getEmpGenderData() {
        return EmpMapper.countEmpGenderData();
    }
}
