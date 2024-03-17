package com.kozich.messenger.service.impl;

import com.kozich.messenger.dao.api.UserDao;
import com.kozich.messenger.dao.api.UserRole;
import com.kozich.messenger.dao.entity.UserEntity;
import com.kozich.messenger.service.mapper.UserMapper;
import com.kozich.messenger.service.api.UserService;
import com.kozich.messenger.service.api.dto.UserDto;

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


}
