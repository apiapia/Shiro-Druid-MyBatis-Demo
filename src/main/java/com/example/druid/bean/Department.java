package com.example.druid.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Department implements Serializable {
    private Integer id;
    private String departmentName;

//       public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "id=" + id +
//                ", departmentName='" + departmentName + '\'' +
//                '}';
//    }
}
