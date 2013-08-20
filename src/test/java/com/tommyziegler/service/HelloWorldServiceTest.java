package com.tommyziegler.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tommyziegler.TestConfiguration;
import com.tommyziegler.services.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class HelloWorldServiceTest {

	@Autowired
	HelloWorldService helloWorldService;

	@Test
	public void checkHelloWorldReturnValue() {
		assertNotNull(helloWorldService);

		assertEquals("Check Hello World return", "Hello World!",
				helloWorldService.printAndReturn());
	}

}
