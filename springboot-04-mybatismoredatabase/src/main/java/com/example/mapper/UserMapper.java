package com.example.mapper;


import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper{
    List<User> getUsers();
}
