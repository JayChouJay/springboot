package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService{
    @Autowired
    private UserMapper mapper;
//    private UserMapper mapper;
    @Override
    public List<User> list() {
        return mapper.selectAll();
//        return mapper.getUsers();
    }
}
