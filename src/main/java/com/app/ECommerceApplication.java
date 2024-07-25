package com.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.config.AppConstants;
import com.app.config.UserInfoConfig;
import com.app.entites.Address;
import com.app.entites.Role;
import com.app.entites.User;
import com.app.repositories.RoleRepo;
import com.app.repositories.UserRepo;
import com.app.security.JWTUtil;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import jakarta.annotation.security.RolesAllowed;

@SpringBootApplication
@SecurityScheme(name = "E-Commerce Application", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class ECommerceApplication implements CommandLineRunner {

	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private JWTUtil jwttoken;
	

	@Override
	public void run(String... args) throws Exception {
		try {
		
			
		
			
//			User userobj=new User();
//			
//		userobj.setUserId(AppConstants.ADMIN_ID);
//			userobj.setFirstName("sakshat");
//			userobj.setLastName("rapkar");
//			userobj.setEmail("sakshatrapkar2@gmail.com");
//			userobj.setMobileNumber("9096888222");
//			userobj.setPassword("password");
			
//			jwttoken.generateToken(userobj.getEmail());
   
			
			

//			Role adminRole = new Role();
//			adminRole.setRoleId(AppConstants.ADMIN_ID);
//			adminRole.setRoleName("ADMIN");
			
//			Role userRole = new Role();
//			userRole.setRoleId(AppConstants.USER_ID);
//			userRole.setRoleName("USER");
//			 Set<Role> roles = new HashSet<>();
//			 roles.add(userRole);
//			 roles.add(adminRole);
//			 userobj.setRoles(roles);
			 

//			Set<Role> roles = Set.of(adminRole, userRole);
//			List<User> users=List.of(userobj);
			
//			User admindetails=new User();
			
//			UserInfoConfig admindata=  new UserInfoConfig();
			
			

//			List<Role> savedRoles = roleRepo.saveAll(roles);
//			List<User>savedUsers=userRepo.saveAll(users);

//			savedRoles.forEach(System.out::println);
//			savedUsers.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
