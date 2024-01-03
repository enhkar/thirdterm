package ru.kstas.MyUiRestDbService.service;

import ru.kstas.MyUiRestDbService.dto.UserDto;
import ru.kstas.MyUiRestDbService.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
