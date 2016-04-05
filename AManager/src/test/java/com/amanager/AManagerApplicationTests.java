package com.amanager;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AManagerApplication.class)
@WebIntegrationTest
public class AManagerApplicationTests {

	// Test RestTemplate to invoke the APIs.
	private RestTemplate restTemplate = new TestRestTemplate();
	
	@Test
	public void contextLoads() throws Exception {
		@SuppressWarnings("unchecked")
		
		Map<String, String> apiResponse = restTemplate.getForObject("http://localhost:8080/greeting", Map.class);
		Assert.assertTrue(apiResponse.get("content"), "Hello, World".equals(apiResponse.get("content")));
	}
}
