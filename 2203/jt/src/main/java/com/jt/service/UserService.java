package com.jt.service;

import com.jt.pojo.User;
import com.jt.vo.PageResult;
import com.jt.vo.SysResult;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    List<User> findAll();

    String login(User user);


    PageResult findUserList(PageResult pageResult);


    void status(User user);

    void addUser(User user);


    User findUserById(Integer id);
}
