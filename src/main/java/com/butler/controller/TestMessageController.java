package com.butler.controller;

import com.butler.model.TestMessage;
import com.butler.repo.TestMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/message")
public class TestMessageController {

    private final TestMessageRepository testMessageRepository;

    @Autowired
    public TestMessageController(TestMessageRepository testMessageRepository) {
        this.testMessageRepository = testMessageRepository;
    }

    @RequestMapping("/all")
    public Iterable<TestMessage> getMessages() {
        return testMessageRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public TestMessage getOneMessage(@PathVariable("id") long id) {
        return testMessageRepository.findOne(id);
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public void persistMessage(@RequestBody TestMessage message) {
        testMessageRepository.save(message);
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public void deleteMessage(@PathVariable("id") long id) {
        testMessageRepository.delete(id);
    }


//    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT)
//    public void UpdateMessage(@PathVariable long id, @RequestBody TestMessage message) {
//    }


}


