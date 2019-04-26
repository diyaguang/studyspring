package com.dygstudio.studyspring.po;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/26 11:22
 * @Description:
 */
public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Customer [id="+id+", username="+username+", jobs="+jobs+", phone="+phone+"]";
    }
}
