package com.amanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amanager.entity.Animal;
import com.amanager.repository.AnimalRepository;

@SpringBootApplication
public class AManagerApplication implements CommandLineRunner {

	@Autowired
	private AnimalRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Animal("Aba", "cate"));
	}

}