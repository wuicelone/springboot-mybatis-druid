package com.wuicelone.smd.mapper;

import com.wuicelone.smd.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    List<User> findAll();
    User findById(Long id);
    void insert(User user);
    void update(User user);
    void delete(Long id);
}
