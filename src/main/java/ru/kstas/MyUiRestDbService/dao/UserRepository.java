package ru.kstas.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kstas.MyUiRestDbService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
