package org.example.pojo;


public class StudentQueryParam {
    private Integer page=1;
    private Integer pageSize=10;
    private String name;
    private Integer clazzId;
    private Integer degree;


    public StudentQueryParam() {
    }

    public StudentQueryParam(Integer page, Integer pageSize, String name, Integer clazzId, Integer degree) {
        this.page = page;
        this.pageSize = pageSize;
        this.name = name;
        this.clazzId = clazzId;
        this.degree = degree;
    }

    /**
     * 获取
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 设置
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return clazzId
     */
    public Integer getClazzId() {
        return clazzId;
    }

    /**
     * 设置
     * @param clazzId
     */
    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    /**
     * 获取
     * @return degree
     */
    public Integer getDegree() {
        return degree;
    }

    /**
     * 设置
     * @param degree
     */
    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String toString() {
        return "StudentQueryParam{page = " + page + ", pageSize = " + pageSize + ", name = " + name + ", clazzId = " + clazzId + ", degree = " + degree + "}";
    }
}
