package com.exam.examportal;

import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examportal.model.Role;
import com.exam.examportal.model.User;
import com.exam.examportal.model.UserRole;
import com.exam.examportal.service.UserService;

@SpringBootApplication
public class ExamportalApplication {

	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		User user = new User();
//		user.setFirstName("Rohith");
//		user.setLastName("Murari");
//		user.setUsername("rohithmv");
//		user.setPassword("password");
//		user.setEmail("rohith@gmail.com");
//		
//		Role role1 = new Role();
//		role1.setRoleId(20);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//	}

}
