package com.abdelmouheimen.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abdelmouheimen.demo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

	List<User> findByFirstName(String name);
}
