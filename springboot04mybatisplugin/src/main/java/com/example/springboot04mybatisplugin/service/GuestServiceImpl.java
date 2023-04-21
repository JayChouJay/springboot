package com.example.springboot04mybatisplugin.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot04mybatisplugin.bean.User;
import com.example.springboot04mybatisplugin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl extends ServiceImpl<UserMapper,User> implements GuestService{
}
