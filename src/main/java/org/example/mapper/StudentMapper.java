package org.example.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Clazz;
import org.example.pojo.PageResult;
import org.example.pojo.Student;
import org.example.pojo.StudentQueryParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
     @MapKey("name")
     List<Map<String, Object>> countStudentCountData();

    public List<Student> page(StudentQueryParam studentQueryParam);

    void addStudent(Student student);

    Student findStudentById(Integer id);

    void updateStudent(Student student);

    void delStudentByIds(Integer[] ids);

    void updateViolation(Integer id, Integer score);
    @MapKey("name")
    List<Map<String, Object>> countStudentDegreeData();
}
