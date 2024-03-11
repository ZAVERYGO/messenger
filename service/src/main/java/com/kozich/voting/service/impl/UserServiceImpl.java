package com.kozich.voting.service.impl;

import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.factory.DaoFactory;
import com.kozich.voting.service.BusinessObj.User;
import com.kozich.voting.service.Mapper.UserMapper;
import com.kozich.voting.service.api.UserService;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = DaoFactory.getUserDao();
    }

    @Override
    public void save(User user) {
        userDao.save(UserMapper.userToUserEntity(user.setRegistrationDate( String.valueOf(LocalDate.now()))));
    }
}
