package com.kozich.voting.service.impl;

import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.factory.DaoFactory;
import com.kozich.voting.service.Mapper.UserMapper;
import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.api.dto.UserDto;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(UserDto userDto) {
        userDao.save(UserMapper.userDtoToUserEntity(userDto.setRegistrationDate( String.valueOf(LocalDate.now()))));
    }

    @Override
    public UserDto getUserByLogin(String login) {
        return UserMapper.userEntityToUserDto(userDao.getUserByLogin(login));
    }

}
