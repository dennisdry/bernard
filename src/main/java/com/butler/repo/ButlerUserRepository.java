package com.butler.repo;

import com.butler.model.ButlerUser;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ButlerUserRepository extends CrudRepository<ButlerUser, Long>{
	List<ButlerUser> findByLastName(String lastName);
}
