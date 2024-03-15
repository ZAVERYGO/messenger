package com.kozich.voting.dao.impl;

import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.api.UserRole;
import com.kozich.voting.dao.entity.UserEntity;

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
    public boolean isExists(String login) {
        for (UserEntity userEntity : userList) {
            boolean result = userEntity.getLogin().equals(login);
            if(result){
                return true;
            }
        }
        return false;
    }
}
