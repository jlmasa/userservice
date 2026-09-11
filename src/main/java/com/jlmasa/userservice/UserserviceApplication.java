package com.jlmasa.userservice;

import com.jlmasa.userservice.domain.Role;
import com.jlmasa.userservice.domain.User;
import com.jlmasa.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}
	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"john masa", "jlmasa", "1234", new ArrayList<>()));
			userService.saveUser(new User(null,"hannah dan", "hughdan", "1234", new ArrayList<>()));
			userService.saveUser(new User(null,"renz revilla", "rrevilla", "1234", new ArrayList<>()));
			userService.saveUser(new User(null,"mae masa", "mmasa", "1234", new ArrayList<>()));

			userService.addRoleToUser("jlmasa", "ROLE_USER");
			userService.addRoleToUser("jlmasa", "ROLE_MANAGER");
			userService.addRoleToUser("jlmasa", "ROLE_ADMIN");
			userService.addRoleToUser("hughdan", "ROLE_USER");
			userService.addRoleToUser("hughdan", "ROLE_SUPERADMIN");
			userService.addRoleToUser("rrevilla", "ROLE_ADMIN");
			userService.addRoleToUser("mmasa", "ROLE_USER");

		};
	}

}
