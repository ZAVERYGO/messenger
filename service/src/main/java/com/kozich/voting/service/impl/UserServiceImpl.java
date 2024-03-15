package com.kozich.voting.service.impl;

import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.api.UserRole;
import com.kozich.voting.dao.entity.UserEntity;
import com.kozich.voting.service.mapper.UserMapper;
import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.api.dto.UserDto;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    private final UserMapper userMapper;

    public UserServiceImpl(UserDao userDao, UserMapper userMapper) {
        this.userDao = userDao;
        this.userMapper = userMapper;
    }

    @Override
    public void save(UserDto userDto) {
        UserEntity userEntity = userMapper.userDtoToUserEntity(userDto
                                                .setRegistrationDate(LocalDate.now())
                                                .setRole(UserRole.USER));

        userDao.save(userEntity);
    }

    @Override
    public UserDto getByLogin(String login) {
        return userMapper.userEntityToUserDto(userDao.getByLogin(login));
    }

    @Override
    public boolean isExists(String login) {
        return userDao.isExists(login);
    }

}
