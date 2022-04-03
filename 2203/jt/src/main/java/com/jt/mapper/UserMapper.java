package com.jt.mapper;
import com.jt.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface UserMapper {

    List<User> findAll();
    @Select("select * from user where username=#{username} and password=#{password}")
    User findUserByUP(User user);

    //1.pojo对象 2.Map集合  3.@Param
    List<User> findUserList(@Param("query") String query,
                            @Param("size") int size,
                            @Param("startNum") int startNum);

    long findCount(String query);
}
