package ru.chgkchat.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chgkchat.core.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
