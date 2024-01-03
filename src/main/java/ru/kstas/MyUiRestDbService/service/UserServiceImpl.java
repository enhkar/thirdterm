package ru.kstas.MyUiRestDbService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kstas.MyUiRestDbService.dao.RoleRepository;
import ru.kstas.MyUiRestDbService.dao.UserRepository;
import ru.kstas.MyUiRestDbService.dto.UserDto;
import ru.kstas.MyUiRestDbService.entity.Role;
import ru.kstas.MyUiRestDbService.entity.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(
            UserRepository userRepository,
            RoleRepository roleRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getFirstName());
        user.setName(userDto.getFirstName() + " " + userDto.getLastName());
        user.setEmail(userDto.getEmail());
        // Шифруем пароль перед сохранением в базу
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        Role role = roleRepository.findByName("ROLE_ADMIN");
        if (role == null) {
            role = new Role();
            role.setName("ROLE_ADMIN");
            roleRepository.save(role);
        }
        user.setRoles(Collections.singletonList(role));
        userRepository.save(user);

    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(this::mapToUserDto).collect(Collectors.toList());
    }

    private UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto();
        String[] strings = user.getName().split(" ");
        userDto.setFirstName(strings[0]);
        userDto.setLastName(strings[1]);
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
