package com.butler.controller;

import com.butler.model.Message;
import com.butler.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @RequestMapping("/findall")
    public Iterable<Message> getMessages() {
        return  messageRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Message getOneMessage(@PathVariable("id") long id) {
        return  messageRepository.getOne(id);
    }

}
