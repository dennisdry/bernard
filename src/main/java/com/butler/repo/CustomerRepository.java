package com.butler.repo;

import java.util.List;

import com.butler.model.User;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<User, Long>{
	List<User> findByLastName(String lastName);
}
