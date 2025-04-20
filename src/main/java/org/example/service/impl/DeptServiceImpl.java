package org.example.service.impl;

import org.example.mapper.DeptMApper;
import org.example.pojo.Dept;
import org.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMApper deptMApper;
    @Override
    public List<Dept> findAll() {
        return deptMApper.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        deptMApper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMApper.insert(dept);
    }
}
