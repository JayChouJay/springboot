package com.example.springbootjpa.service;

import com.example.springbootjpa.bean.Guest;
import com.example.springbootjpa.bean.User;


import java.util.List;

public interface GuestService {
    List<User> list();
}
