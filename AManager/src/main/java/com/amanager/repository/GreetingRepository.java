/**
 * 
 */
package com.amanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amanager.entity.Greeting;

/**
 * @author geci
 *
 */
public interface GreetingRepository extends MongoRepository<Greeting, String> {

	public Greeting findByContent(String content);

}
