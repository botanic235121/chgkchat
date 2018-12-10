package ru.chgkchat.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chgkchat.core.domain.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
