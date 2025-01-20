package com.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

	 public void getUserDetails(String username) {
	        System.out.println("UserEntity: Fetching details for user - " + username);     
	    }
}
