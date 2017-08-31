package com.butler.controller;

import com.butler.model.Message;
import com.butler.model.TestMessage;
import com.butler.repo.TestMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/message")
public class TestMessageController {

    @Autowired
    private final TestMessageRepository testMessageRepository;

    @Autowired
    public TestMessageController(TestMessageRepository testMessageRepository) {
        this.testMessageRepository = testMessageRepository;
    }

    @RequestMapping("/findall")
    public Iterable<TestMessage> getMessages() {
        return  testMessageRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public TestMessage getOneMessage(@PathVariable("id") long id) {
        return testMessageRepository.findOne(id);
    }

    @RequestMapping(value = "/sendmessage", method = RequestMethod.POST)
    public void persistMessage(@RequestBody TestMessage message) {
        testMessageRepository.save(message);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void DeleteMessage(@PathVariable("id") long id) {
        testMessageRepository.delete(id);
    }

    

    }


