package com.tommyziegler.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.tommyziegler.services.HelloWorldService;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldControllerTest {

	@Mock
	HelloWorldService helloWorldServiceMock;

	HelloWorldController helloWorldController = null;

	@Before
	public void createControllerWithMockedService() {
		helloWorldController = new HelloWorldController(helloWorldServiceMock);
		assertNotNull(helloWorldController);
	}

	@Test
	public void testThatHelloWorldMethodReturnsServicePrintAndReturnValue() {
		String expectsString = "Hello Test";
		Mockito.when(helloWorldServiceMock.printAndReturn()).thenReturn(
				expectsString);
		String actualString = helloWorldController.helloWorld();

		assertEquals("Check controller over mocked service", expectsString,
				actualString);
	}

}
