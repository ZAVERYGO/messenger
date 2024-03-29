package com.kozich.messenger.service.mapper;

import com.kozich.messenger.dao.entity.UserEntity;
import com.kozich.messenger.service.api.dto.UserDto;

public class UserMapper {
    public UserEntity userDtoToUserEntity(UserDto userDto){
        if (userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setFirstName(userDto.getFirstName() )
                .setLastName(userDto.getLastName() )
                .setPatronymic(userDto.getPatronymic() )
                .setDayOfBirth(userDto.getDayOfBirth() )
                .setRegistrationDate(userDto.getDayOfBirth() )
                .setLogin(userDto.getLogin() )
                .setPassword(userDto.getPassword() )
                .setRole(userDto.getRole() );

        return userEntity;
    }

    public UserDto userEntityToUserDto(UserEntity userEntity){
        if (userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setFirstName(userEntity.getFirstName() )
                .setLastName(userEntity.getLastName() )
                .setPatronymic(userEntity.getPatronymic() )
                .setDayOfBirth(userEntity.getDayOfBirth() )
                .setRegistrationDate(userEntity.getDayOfBirth() )
                .setLogin(userEntity.getLogin() )
                .setPassword(userEntity.getPassword() )
                .setRole(userEntity.getRole() );

        return userDto;
    }
}
