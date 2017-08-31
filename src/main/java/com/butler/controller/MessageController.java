package com.butler.controller;

import com.butler.model.Message;
import com.butler.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
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
        return messageRepository.findOne(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public void DeleteMessage(@PathVariable("id") long id) {
        messageRepository.delete(id);
    }

    @RequestMapping(value = "/sendmessage", method = RequestMethod.POST)
    public void persistMessage(@RequestBody Message message) {
        messageRepository.save(message);
    }
    }


