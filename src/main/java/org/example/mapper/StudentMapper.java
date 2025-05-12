package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Clazz;
import org.example.pojo.PageResult;
import org.example.pojo.Student;
import org.example.pojo.StudentQueryParam;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<Student> page(StudentQueryParam studentQueryParam);

    void addStudent(Student student);

    Student findStudentById(Integer id);

    void updateStudent(Student student);
}
