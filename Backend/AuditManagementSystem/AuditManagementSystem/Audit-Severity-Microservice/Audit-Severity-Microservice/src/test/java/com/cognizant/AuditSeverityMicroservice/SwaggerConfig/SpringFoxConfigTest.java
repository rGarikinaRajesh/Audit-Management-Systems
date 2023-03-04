package com.cognizant.AuditSeverityMicroservice.SwaggerConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * Test class to test the swagger SpringFoxConfig class
 *
 */

@ContextConfiguration @Slf4j
@SpringBootTest
public class SpringFoxConfigTest {
	
	@Mock
	Environment env;
	
	@SuppressWarnings("unused")
	@InjectMocks
	SpringFoxConfig config;
	
	
	
	@Test
	public void contextLoads() {
		SpringFoxConfig config=new SpringFoxConfig();
		assertNotNull(config);
	}
	

	


}
