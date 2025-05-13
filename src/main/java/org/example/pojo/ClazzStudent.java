package org.example.pojo;

import java.util.List;

public class ClazzStudent {
    private List clazzList;
    private List dataList;

    public ClazzStudent() {
    }

    public ClazzStudent(List clazzList, List studentList) {
        this.clazzList = clazzList;
        this.dataList = studentList;
    }

    /**
     * 获取
     * @return clazzList
     */
    public List getClazzList() {
        return clazzList;
    }

    /**
     * 设置
     * @param clazzList
     */
    public void setClazzList(List clazzList) {
        this.clazzList = clazzList;
    }

    /**
     * 获取
     * @return studentList
     */
    public List getDataList() {
        return dataList;
    }

    /**
     * 设置
     * @param studentList
     */
    public void setDataList(List studentList) {
        this.dataList = studentList;
    }

    public String toString() {
        return "ClazzStudent{clazzList = " + clazzList + ", studentList = " + dataList + "}";
    }
}
