package ru.chgkchat.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chgkchat.core.domain.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
