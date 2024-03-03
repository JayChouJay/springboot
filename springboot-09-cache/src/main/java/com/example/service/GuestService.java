package com.example.service;

import com.example.domain.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();
    void add(Guest guest);
    Guest update(Guest guest);
    Guest get(int id);
    void delete(int id);
    void deleteAll();
}
