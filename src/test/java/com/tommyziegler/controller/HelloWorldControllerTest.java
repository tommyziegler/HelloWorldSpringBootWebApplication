package com.tommyziegler.controller;

import static org.junit.Assert.*;

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
	
	@Test
	public void test() {
		String expectsString = "Hello Test";
		Mockito.when(helloWorldServiceMock.printAndReturn()).thenReturn(expectsString);
		
		assertEquals("Check controller over mocked service", expectsString, new HelloWorldController(helloWorldServiceMock).helloWorld());
	}

}
