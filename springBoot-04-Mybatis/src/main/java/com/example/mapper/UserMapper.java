package com.example.mapper;


import com.example.domain.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper{
    List<User> getUsers();
}
