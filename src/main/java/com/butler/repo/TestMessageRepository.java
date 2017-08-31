package com.butler.repo;

import com.butler.model.TestMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestMessageRepository extends JpaRepository<TestMessage, Long> {
}