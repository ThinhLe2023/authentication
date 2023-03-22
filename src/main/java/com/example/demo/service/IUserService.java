package com.example.demo.service;

import com.example.demo.entity.User;

public interface IUserService extends IGeneralService<User>{
    boolean getValuationUser(User criteria);
}
