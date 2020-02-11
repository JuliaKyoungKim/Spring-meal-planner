package com.github.juliakyoungkim;

import com.github.juliakyoungkim.model.Person;
import com.github.juliakyoungkim.repository.PersonRepository;
import com.github.juliakyoungkim.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringMealPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMealPlannerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PersonService personService) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen").forEach( name -> {
						Person person = new Person(name, "123", name.toLowerCase()+"@domain.com");
						personService.create(person);
					}
			);
			personService.findAll().forEach(System.out::println);
		};
	}
}
