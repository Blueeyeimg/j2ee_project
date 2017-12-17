package com.ecnu.car_rent.service;

import com.ecnu.car_rent.model.User;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    User getUserById(Integer userId);
    int insertNewUser(User user);
}
