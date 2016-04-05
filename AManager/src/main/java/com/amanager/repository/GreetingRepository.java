/**
 * 
 */
package com.amanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amanager.entity.Greeting;


public interface GreetingRepository extends MongoRepository<Greeting, String> {

	public Greeting findByContent(String content);

}
