package ru.kstas.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kstas.MyUiRestDbService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
