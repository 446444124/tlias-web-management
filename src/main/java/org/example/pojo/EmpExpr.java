package org.example.pojo;

import java.time.LocalDate;

/**
 * 工作经历
 */
public class EmpExpr {
    private Integer id;
    private Integer empId;
    private LocalDate begin;
    private LocalDate end;
    private String company;
    private String job;

    // 无参构造器
    public EmpExpr() {
    }

    // Getter/Setter 方法
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getEmpId() { return empId; }
    public void setEmpId(Integer empId) { this.empId = empId; }

    public LocalDate getBegin() { return begin; }
    public void setBegin(LocalDate begin) { this.begin = begin; }

    public LocalDate getEnd() { return end; }
    public void setEnd(LocalDate end) { this.end = end; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    // toString方法
    @Override
    public String toString() {
        return "EmpExpr{" +
                "id=" + id +
                ", empId=" + empId +
                ", begin=" + begin +
                ", end=" + end +
                ", company='" + company + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}
