package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    //关联关系: 一个员工对应一个部门
    private Dept dept;
    //private Integer deptId;
}