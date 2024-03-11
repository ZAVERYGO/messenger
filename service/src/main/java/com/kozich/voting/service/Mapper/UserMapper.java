package com.kozich.voting.service.Mapper;

import com.kozich.voting.dao.entity.UserEntity;
import com.kozich.voting.service.BusinessObj.User;

public class UserMapper {
    public static UserEntity userToUserEntity(User user){
        if (user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setFirstName(user.getFirstName() )
                .setLastName(user.getLastName() )
                .setPatronymic(user.getPatronymic() )
                .setDayOfBirth(user.getDayOfBirth() )
                .setRegistrationDate(user.getDayOfBirth() )
                .setLogin(user.getLogin() )
                .setPassword(user.getPassword() )
                .setRole(user.getRole() );

        return userEntity;
    }
}
