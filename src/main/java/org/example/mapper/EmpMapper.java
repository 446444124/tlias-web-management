package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

//------------------------------------原始分页查询方式-------------------------------------
//    @Select("select count(*) from emp e left join dept d on d.id = e.dept_id;")
//    public long count();
//
//    @Select("select e.*,d.name deptName from emp e left join dept d on d.id = e.dept_id"
//            +" order by update_time desc limit #{start},#{pageSize}")
//    public List<Emp> list(Integer start, Integer pageSize);


   // @Select("select e.*,d.name from emp e left join dept d on d.id = e.dept_id\n" +
            //"    where e.name like '%阮%' and e.gender = 1 and e.entry_date between '' and ''\n" +
            //"    order by e.update_time desc")
//   public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);

   public List<Emp> list(EmpQueryParam empQueryParam);

   @Options(useGeneratedKeys = true,keyProperty = "id")
   @Insert("insert into" +
           "    emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)" +
           "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
   void insert(Emp emp);



    void deleteByIds(List<Integer> ids);

    void deleteByEmpIds(List<Integer> empIds);


    Emp getById(Integer id);

    void updateById(Emp emp);
}
