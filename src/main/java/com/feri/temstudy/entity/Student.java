package com.feri.temstudy.entity;

import java.util.Date;

/**
 *@Author feri
 *@Date Created in 2018/9/13 10:27
 */
public class Student {
    private int no;
    private String name;
    private Date birthday;
    private String sex;

    public int getNo() {
        return no;
    }

    public Student(int no, String name, Date birthday, String sex) {
        this.no = no;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public Student() {
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
