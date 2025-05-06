package org.example.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private String phone;
    private Integer job;
    private Integer salary;
    private String image;
    private LocalDate entryDate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    //部门名称
    private String deptName;
     //新增员工的工作经历
    private List<EmpExpr> exprList;
    // 无参构造器
    public Emp() {
    }

    // 全参构造器（根据需求可选）
    public Emp(Integer id, String username, String password, String name, Integer gender,
              String phone, Integer job, Integer salary, String image, LocalDate entryDate,
              Integer deptId, LocalDateTime createTime, LocalDateTime updateTime, List<EmpExpr> exprList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.job = job;
        this.salary = salary;
        this.image = image;
        this.entryDate = entryDate;
        this.deptId = deptId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.exprList = exprList;
    }

    // Getter/Setter 方法
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getGender() { return gender; }
    public void setGender(Integer gender) { this.gender = gender; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Integer getJob() { return job; }
    public void setJob(Integer job) { this.job = job; }

    public Integer getSalary() { return salary; }
    public void setSalary(Integer salary) { this.salary = salary; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public LocalDate getEntryDate() { return entryDate; }
    public void setEntryDate(LocalDate entryDate) { this.entryDate = entryDate; }

    public Integer getDeptId() { return deptId; }
    public void setDeptId(Integer deptId) { this.deptId = deptId; }

    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }

    public LocalDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(LocalDateTime updateTime) { this.updateTime = updateTime; }

    // 新增工作经历的getter/setter
    public List<EmpExpr> getExprList() {
        return exprList;
    }

    public void setExprList(List<EmpExpr> exprList) {
        this.exprList = exprList;
    }

    // 新增部门名称的getter/setter
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // toString方法
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", job=" + job +
                ", salary=" + salary +
                ", image='" + image + '\'' +
                ", deptName='" + deptName + '\'' + // 新增部门名称输出
                ", entryDate=" + entryDate +
                ", deptId=" + deptId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", exprList=" + exprList +  // 新增工作经历输出
                '}';
    }

}
