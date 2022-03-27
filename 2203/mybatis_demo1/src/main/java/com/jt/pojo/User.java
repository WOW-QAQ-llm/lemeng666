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
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public void addUser(){
        User user = new User();
        user.setId(1000)
                .setName("tomcat")
                .setAge(18)
                .setSex("男");
    }
}
