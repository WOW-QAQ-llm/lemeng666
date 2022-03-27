package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private Integer deptId;
    private String deptName;
    //关联 一个部门下有多个员工
    private List<Emp> emps;
}
