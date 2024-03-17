package com.kozich.messenger.dao.api;

import com.kozich.messenger.dao.entity.UserEntity;

public interface UserDao {
    void save(UserEntity userEntity);

    UserEntity getByLogin(String login);

}
