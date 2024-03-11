package com.kozich.voting.service.api;

import com.kozich.voting.service.api.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);

    UserDto getUserByLogin(String login);
}
