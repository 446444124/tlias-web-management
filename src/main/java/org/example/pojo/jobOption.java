package org.example.pojo;

import java.util.List;

public class jobOption {
    private List jobList;
    private List dataList;

    public jobOption() {
    }

    public jobOption(List jobList, List dataList) {
        this.jobList = jobList;
        this.dataList = dataList;
    }

    /**
     * 获取
     * @return jobList
     */
    public List getJobList() {
        return jobList;
    }

    /**
     * 设置
     * @param jobList
     */
    public void setJobList(List jobList) {
        this.jobList = jobList;
    }

    /**
     * 获取
     * @return dataList
     */
    public List getDataList() {
        return dataList;
    }

    /**
     * 设置
     * @param dataList
     */
    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    public String toString() {
        return "jobOption{jobList = " + jobList + ", dataList = " + dataList + "}";
    }
}
