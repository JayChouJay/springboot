package com.example.mapper2;


import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper2 {
    @Select("select * from user")
    List<User> getUsers();
}
