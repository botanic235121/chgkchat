package ru.chgkchat.core.domain;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "chats")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chat_id")
    private Long chatId;

    private String chatName;

    private Instant createChatDate;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL) // field CascadeType: if chat will deleted all users also will deleted.
    private Set<User> users;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private Set<Message> messages;

    public Chat() {
    }

    public Chat(String chatName, Instant createChatDate) {
        this.chatName = chatName;
        this.createChatDate = createChatDate;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Instant getCreateChatDate() {
        return createChatDate;
    }

    public void setCreateChatDate(Instant createChatDate) {
        this.createChatDate = createChatDate;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Chat chat = (Chat) o;
        return chatId.equals(chat.chatId) &&
                chatName.equals(chat.chatName) &&
                createChatDate.equals(chat.createChatDate) &&
                Objects.equals(users, chat.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chat_id=" + chatId +
                ", chatName='" + chatName + '\'' +
                ", createChatDate=" + createChatDate +
                ", users=" + users +
                '}';
    }
}
