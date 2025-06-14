package org.example.service;

import org.example.pojo.PageResult;
import org.example.pojo.Student;
import org.example.pojo.StudentQueryParam;

public interface StudentService {
    PageResult<Student> page(StudentQueryParam studentQueryParam);

    void addStudent(Student student);

    Student findStudentById(Integer id);

    void updateStudent(Student student);

    void delStudentByIds(Integer[] ids);

    void updateViolation(Integer id, Integer score);
}
