package org.example.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.mapper.EmpMapper;
import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;
import org.example.pojo.PageResult;
import org.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    //------------------------原始分页查询方式-----------------------
//    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize) {
//        //1.查询总记录数
//        long total = empMapper.count();
//        //2.查询结果列表
//        int start = (page-1)*pageSize;
//        List<Emp> rows = empMapper.list(start, pageSize);
//        //3.封装PageResult对象
//        return new PageResult<Emp>(total,rows);
//    }


//    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender,
//                                LocalDate begin, LocalDate end) {
//        //1.设置分页参数
//        PageHelper.startPage(page,pageSize);
//        //2.查询
//        List<Emp> empList = empMapper.list(name,gender,begin,end);
//        //3.解析查询结果,封装PageResult对象
//        Page<Emp> p = (Page<Emp>) empList;
//        return new PageResult<Emp>(p.getTotal(),p.getResult());
//    }

    @Override
    public PageResult<Emp> page(EmpQueryParam empQueryParam) {
        //1.设置分页参数
        PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());
        //2.查询
        List<Emp> empList = empMapper.list(empQueryParam);
        //3.解析查询结果,封装PageResult对象
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult<Emp>(p.getTotal(),p.getResult());
    }
}
