package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bean.User;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl extends ServiceImpl<UserMapper, User> implements GuestService{
}
