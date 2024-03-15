package com.kozich.voting.dao.api;

import com.kozich.voting.dao.entity.UserEntity;

public interface UserDao {
    void save(UserEntity userEntity);

    UserEntity getByLogin(String login);

    boolean isExists(String login);
}
