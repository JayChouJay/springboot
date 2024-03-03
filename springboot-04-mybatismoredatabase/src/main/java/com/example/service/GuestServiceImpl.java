package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import com.example.mapper2.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService{
    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserMapper2 mapper2;
    @Override
    public List<User> list() {
//        return mapper.selectAll();
        return mapper.getUsers();
    }
}
