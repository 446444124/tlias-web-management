package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Clazz;
import org.example.pojo.ClazzQueryParam;

import java.util.List;
@Mapper
public interface ClazzMapper {
    public List<Clazz> list(ClazzQueryParam ClazzQueryParam);

    void delClazzById(Integer id);

    void insertClazz(Clazz clazz);

    Clazz getClazzById(Integer id);

    void updateClazz(Clazz clazz);

    int selectStudentCountByClazzId(Integer clazzId);

    List<Clazz> getAllClazzs();
}
