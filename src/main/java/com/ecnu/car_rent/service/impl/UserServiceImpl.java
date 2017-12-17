package com.ecnu.car_rent.service.impl;

import com.ecnu.car_rent.dao.UserMapper;
import com.ecnu.car_rent.model.User;
import com.ecnu.car_rent.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserMapper userMapper;

    public int insertNewUser(User user){
       return userMapper.insert(user);
    }
    
    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
