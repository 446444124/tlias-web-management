package org.example.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Student {
    private Integer id; //ID
    private String name; //姓名
    private String no; //序号
    private Integer gender; //性别 , 1: 男 , 2 : 女
    private String phone; //手机号
    private String idCard; //身份证号
    private Integer isCollege; //是否来自于院校, 1: 是, 0: 否
    private String address; //联系地址
    private Integer degree; //最高学历, 1: 初中, 2: 高中 , 3: 大专 , 4: 本科 , 5: 硕士 , 6: 博士
    private LocalDate graduationDate; //毕业时间
    private Integer clazzId; //班级ID
    private Short violationCount; //违纪次数
    private Short violationScore; //违纪扣分
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //修改时间
    private String clazzName;//班级名称

    // 无参构造方法
    public Student() {
    }

    // Getter 和 Setter 方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getIsCollege() {
        return isCollege;
    }

    public void setIsCollege(Integer isCollege) {
        this.isCollege = isCollege;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public Short getViolationCount() {
        return violationCount;
    }

    public void setViolationCount(Short violationCount) {
        this.violationCount = violationCount;
    }

    public Short getViolationScore() {
        return violationScore;
    }

    public void setViolationScore(Short violationScore) {
        this.violationScore = violationScore;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", isCollege=" + isCollege +
                ", address='" + address + '\'' +
                ", degree=" + degree +
                ", graduationDate=" + graduationDate +
                ", clazzId=" + clazzId +
                ", violationCount=" + violationCount +
                ", violationScore=" + violationScore +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", clazzName='" + clazzName + '\'' +
                '}';
    }


}