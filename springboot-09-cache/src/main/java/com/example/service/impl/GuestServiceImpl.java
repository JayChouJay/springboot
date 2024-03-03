package com.example.service.impl;

import com.example.dao.GuestDao;
import com.example.domain.Guest;
import com.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 统一缓存名
 */
@CacheConfig(cacheNames = "guests")
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        return guestDao.getGuests();
    }

    @Override
    public void add(Guest guest) {

    }

    /**
     * 设置key的值和cacheable保值一致
     * 方式一：拿到参数的id - key=“#guest.id”
     *
     * @param guest
     */
    @CachePut(cacheNames = "guests", key = "#guest.id")
    @Override
    public Guest update(Guest guest) {
        guestDao.update(guest);
        return guest;
    }

    //id>1时才存入缓存，还可以使用unless
    @Cacheable(cacheNames = "guests", key = "#id", condition = "#id>1")
    @Override
    public Guest get(int id) {
        System.out.println("查询第" + id + "位嘉宾");
        return guestDao.getGuestById(id);
    }

    @CacheEvict(cacheNames = "guests", key = "#id")
    @Override
    public void delete(int id) {
        guestDao.delete(id);
    }

    /**
     * 默认，如果出现错误，缓存不会改变，可以设置beforeInvocation=true,在执行方法前操作缓存
     * @Caching是个组合注解
     */
    @CacheEvict(cacheNames = "guests"/*,allEntries = true*/)
    @Caching(cacheable = {},put = {},evict = {})
    @Override
    public void deleteAll() {
        guestDao.deleteAll();
    }

}
