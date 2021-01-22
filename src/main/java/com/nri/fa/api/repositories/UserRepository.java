package com.nri.fa.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nri.fa.api.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByFirstName(String name);

	User findById(long id);
}