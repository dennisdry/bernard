package com.butler.repo;

import java.util.List;

import com.butler.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long>{
    List<Message> findByUser(long id);
}