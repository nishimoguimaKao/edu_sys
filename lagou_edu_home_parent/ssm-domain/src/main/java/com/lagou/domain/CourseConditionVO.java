package com.lagou.domain;

public class CourseConditionVO {

    private String courseName;
    private Integer status;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CourseConditionVO{" +
                "courseName='" + courseName + '\'' +
                ", status=" + status +
                '}';
    }
}
