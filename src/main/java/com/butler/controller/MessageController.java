package com.butler.controller;

import com.butler.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @RequestMapping("/message/findall")
    public String findAllMessage() {
        return "LOL";
    }

}
