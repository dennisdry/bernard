package com.butler.repo;

import java.util.List;

import com.butler.model.Message;
import com.butler.model.TestMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TestMessageRepository extends JpaRepository<TestMessage, Long> {
}