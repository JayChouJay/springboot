package com.example.springbootjpa.service;

import com.example.springbootjpa.bean.Guest;
import com.example.springbootjpa.bean.User;
import com.example.springbootjpa.dao.UserRepository;
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
