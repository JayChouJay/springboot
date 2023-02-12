package com.example.springbootmybatis.service;

import com.example.springbootmybatis.bean.User;
import com.example.springbootmybatis.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService{
    @Autowired
    private UserRepository repository;
    @Override
    public List<User> list() {
        return repository.findAll();
    }
}
