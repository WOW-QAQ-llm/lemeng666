package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper //将接口交给Spring容器管理 Map<userMapper,JDK代理对象>
public interface UserMapper {

    //指定接口方法 查询demo_user的全部数据
    List<User> findAll();

    void saveUser(User user);

    int saveUser2(User user);

    void updateUserById(User user);

    void deleteUserById(User user);

    List<User> findUserByMap(Map map);

    List<User> findUserByColumn(Map map);
}
