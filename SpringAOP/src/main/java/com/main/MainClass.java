package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.User;

public class MainClass {

	public static void main(String[] args) {
		
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);

        User userEntity = context.getBean(User.class);

        userEntity.getUserDetails("Yash");
    }
}
