package com.nri.fa.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nri.fa.api.services.UserService;
import com.nri.fa.api.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

	@RequestMapping("")
	public User index() {
		return userService.findById(1);
	}
}