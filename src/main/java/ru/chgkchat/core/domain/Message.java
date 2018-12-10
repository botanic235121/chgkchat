package ru.chgkchat.core.domain;

import javax.persistence.*;


@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long message_id;

    private String content;

    private long chat_id;

    private long user_id;
}
