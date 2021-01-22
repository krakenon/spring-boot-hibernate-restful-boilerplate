package com.nri.fa.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nri.fa.api.models.User;
import com.nri.fa.api.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository serRepository;

	public List<User> findByFirstName(String name) {

        return null;
    }

	public User findById(long id) {
        User user = new User("Niko", "Phung");

        return user;
    }
}