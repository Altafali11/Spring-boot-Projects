package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userrepository = context.getBean(UserRepository.class);
		
	/*	User user = new User();
		user.setName("Altaf");
		user.setCity("Greater Noida");
		user.setStatus("i am a beginner");
		
		User user1 = userrepository.save(user);
		
		System.out.println(user1);
	*/
		// create object of user
	/*	User user1 = new User();
		user1.setName("Altu");
		user1.setCity("Noida");
		user1.setStatus("i am also beginner");
		
		
		User user2 = new User();
		user2.setName("Pandey");
		user2.setCity("guraon");
		user2.setStatus("i am also beginner");
		// save single user 
	//	User resultuser =  userrepository.save(user1);
	//	System.out.println("saved user " + resultuser);
		
		// save multiple users
		List<User> users = List.of(user1,user2);
		Iterable<User> result = userrepository.saveAll(users);
		 result.forEach(user->{
			 System.out.println(user);
		 });
	*/
		// update the user of id number 10
	/*  Optional<User> optional = userrepository.findById(10);
		User user = optional.get();
		user.setStatus("i am a python programmer");
		user.setName("junaid");
		User result = userrepository.save(user);
		System.out.println(result);
	*/
		//how to get the data
		// by id
	/*	Optional<User> optional = userrepository.findById(9);
		User result = optional.get();
		 System.out.println(result);
		 
		 //  find all
		 
		 Iterable<User>itr = userrepository.findAll();
		 itr.forEach(user->{System.out.println(user);});
	*/
		// delete single entity
		userrepository.deleteById(11);
		System.out.println("deleted");
		
		// delete multiple entities
		Iterable<User> alluser = userrepository.findAll();
		alluser.forEach(user->System.out.println(user));
		userrepository.deleteAll(alluser);
		
	}

}
 