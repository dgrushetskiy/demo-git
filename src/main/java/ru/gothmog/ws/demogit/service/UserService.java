package ru.gothmog.ws.demogit.service;

import ru.gothmog.ws.demogit.model.dto.UserDto;

public interface UserService {

    UserDto getById(Long id);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);
}
