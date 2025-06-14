package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.EmpExpr;

import java.util.List;

@Mapper
public interface EmpExprMapper {
    void insertBatch(List<EmpExpr> exprList);
}
