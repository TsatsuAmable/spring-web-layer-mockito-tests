package com.example.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringTestingApplicationTests {

	@Autowired
	private HomeController homeController;

	@Test
	void contextLoads() throws Exception {
		assertThat(homeController).isNotNull();
	}

}
