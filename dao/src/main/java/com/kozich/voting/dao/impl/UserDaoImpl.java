package com.kozich.voting.dao.impl;

import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    List<UserEntity> userList = new ArrayList<>();

    @Override
    public void save(UserEntity userEntity) {
        userList.add(userEntity);
    }
}
