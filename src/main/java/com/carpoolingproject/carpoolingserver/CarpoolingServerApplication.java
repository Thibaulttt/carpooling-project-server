package com.carpoolingproject.carpoolingserver;

import com.carpoolingproject.carpoolingserver.model.User;
import com.carpoolingproject.carpoolingserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarpoolingServerApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarpoolingServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// clean database before launching
		userRepository.deleteAll();

		User u = new User("thibault.le.guillou79@gmail.com", null, "Thibault", "LG", null);

		userRepository.insert(u);
	}
}
