/**
 * 
 */
package com.amanager.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amanager.entity.Animal;

public interface AnimalRepository extends MongoRepository<Animal, String> {

	public Animal findByFirstName(String firstName);

	public List<Animal> findByLastName(String lastName);

}
