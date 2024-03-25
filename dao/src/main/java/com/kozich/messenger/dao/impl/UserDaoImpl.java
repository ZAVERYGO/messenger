package com.kozich.messenger.dao.impl;

import com.kozich.messenger.dao.api.UserDao;
import com.kozich.messenger.dao.api.UserRole;
import com.kozich.messenger.dao.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<UserEntity> userList = new ArrayList<>(
            List.of(new UserEntity().setFirstName("Nikita")
                                    .setLastName("Kozich")
                                    .setPatronymic("Yurievich")
                                    .setLogin("ZAVERYGO")
                                    .setPassword("12345678")
                                    .setRole(UserRole.ADMIN)));

    @Override
    public void save(UserEntity userEntity) {
        userList.add(userEntity);
    }

    @Override
    public UserEntity getByLogin(String login) {
        for (UserEntity userEntity : userList) {
            if(userEntity.getLogin().equals(login)){
                return userEntity;
            }
        }
        return null;
    }

    @Override
    public Long getQuantity() {
        return (long) userList.size();
    }

}
