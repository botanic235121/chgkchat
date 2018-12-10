package ru.chgkchat.core.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "chats")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chat_id")
    private long chat_id;

    private String chatName;

    private Date createChatDate;

    @OneToMany(mappedBy = "chat_id", cascade = CascadeType.ALL) // field CascadeType: if chat will deleted all users also will deleted.
    private Set<User> users;


    public Chat(String chatName, Date createChatDate) {
        this.chatName = chatName;
        this.createChatDate = createChatDate;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Date getCreateChatDate() {
        return createChatDate;
    }

    public void setCreateChatDate(Date createChatDate) {
        this.createChatDate = createChatDate;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
