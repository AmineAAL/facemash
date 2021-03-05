package com.catmash.backcatmash;

import com.catmash.backcatmash.repository.CatRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.catmash.backcatmash.repository")
public class BackCatmashApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackCatmashApplication.class, args);
	}

}
