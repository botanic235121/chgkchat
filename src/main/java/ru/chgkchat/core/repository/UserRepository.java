package ru.chgkchat.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chgkchat.core.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
