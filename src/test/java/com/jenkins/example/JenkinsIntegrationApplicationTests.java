package com.jenkins.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinsIntegrationApplicationTests {
	
	private static Logger logger = LoggerFactory.getLogger(JenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executed...");
		assertEquals(true, true);
	}

}
