package com.kozich.voting.dao.api;

import com.kozich.voting.dao.entity.UserEntity;

public interface UserDao {
    void save(UserEntity userEntity);

    UserEntity getUserByLogin(String login);
}
