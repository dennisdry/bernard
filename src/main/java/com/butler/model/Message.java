package com.butler.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Message store every message send to the application by the users.
 */
@Entity(name = "butler_message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String message;

    @ManyToOne(cascade = CascadeType.ALL)
    private MessageType messageType;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Tag> tags = new ArrayList<>();

    public Message(){}

    public Message(String name, MessageType messageType) {
        this.message = name;
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String name) {
        this.message = name;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag tag){ this.tags.add(tag);}
}
