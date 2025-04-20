package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Emp;
import org.example.pojo.EmpQueryParam;

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
}
