package com.kozich.messenger.service.api;

import com.kozich.messenger.service.api.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);

    UserDto getByLogin(String login);
}
