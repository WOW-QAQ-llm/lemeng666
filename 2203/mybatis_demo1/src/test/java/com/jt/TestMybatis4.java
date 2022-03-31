package com.jt;

import com.jt.mapper.DeptMapper;
import com.jt.mapper.EmpMapper;
import com.jt.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class TestMybatis4 {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private DeptMapper deptMapper;
    @Test
    public void TestOneToOne(){
        List<Emp> list = empMapper.oneToOne();
        System.out.println(list);
    }
}
