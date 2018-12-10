package ru.chgkchat.core.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long user_id;

    private String userName;

    private String password;

    private Date registration;


    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat_id;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id_role", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_name_user", referencedColumnName = "role_name"))
    private Set<Role> roles;

    public User(){

    }

    public User(String userName, String password, Date registration) {
        this.userName = userName;
        this.password = password;
        this.registration = registration;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public Chat getChat_id() {
        return chat_id;
    }

    public void setChat_id(Chat chat_id) {
        this.chat_id = chat_id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
