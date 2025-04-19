package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMApper {

//    @Results({
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })

    @Select("select id, name, create_time, update_time from dept order by update_time desc ;")
    List<Dept> findAll();
}
