package org.example.service;

import org.example.pojo.jobOption;

import java.util.List;
import java.util.Map;

public interface ReportService {


    jobOption getEmpJobData();

    List<Map<String, Object>> getEmpGenderData();
}
