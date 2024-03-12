package cgi.be;

import cgi.be.repositry.UsersRepository;
import cgi.be.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BeApplication {
	@Autowired
	private  UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BeApplication.class, args);
		System.out.print("Server running!");
	}

	@Bean
	public CommandLineRunner init(){
		return args -> {
			System.out.print(userService.getUserByEmail("a"));
		};
	}

}
