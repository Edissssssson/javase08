package com.bjpowernode.javase.entity;
import java.util.Objects;
public class Student {
    private  String name;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    /*//重写equals方法 自己重写
    public boolean equals(Object obj){
        if(obj==null|| !(obj instanceof Student))  return false;
        if(obj==this) return true;
        Student s=(Student)obj;
        return this.name.equals(s.name);
    }*/
}

