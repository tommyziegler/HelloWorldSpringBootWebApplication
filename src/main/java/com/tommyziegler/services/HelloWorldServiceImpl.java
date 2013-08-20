package com.tommyziegler.services;

import org.springframework.stereotype.Service;

/**
 * The implementation of the Hello World Service
 * 
 * @author tommyziegler
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String printAndReturn() {
		String helloWorld = "Hello World!";
		System.out.println(helloWorld);
		return helloWorld;
	}

}
