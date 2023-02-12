package com.example.springbootmybatis.dao;


import com.example.springbootmybatis.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
