package ru.chgkchat.core.domain;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    private String username;

    private String password;

    private Instant registration;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Message> messageId;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
               inverseJoinColumns = @JoinColumn(name = "role_name", referencedColumnName = "role_name"))
    private Set<Role> roles;

    public User() {

    }

    public User(String username, String password, Instant registration) {
        this.username = username;
        this.password = password;
        this.registration = registration;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Instant getRegistration() {
        return registration;
    }

    public void setRegistration(Instant registration) {
        this.registration = registration;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chatId) {
        this.chat = chatId;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Message> getMessageId() {
        return messageId;
    }

    public void setMessageId(Set<Message> messageId) {
        this.messageId = messageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return userId.equals(user.userId) &&
                username.equals(user.username) &&
                password.equals(user.password) &&
                registration.equals(user.registration) &&
                Objects.equals(chat, user.chat) &&
                roles.equals(user.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registration=" + registration +
                ", chatId=" + chat +
                ", roles=" + roles +
                '}';
    }
}
