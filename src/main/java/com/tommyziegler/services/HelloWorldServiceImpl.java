package com.tommyziegler.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String printAndReturn() {
		String helloWorld = "Hello World!";
		System.out.println(helloWorld);
		return helloWorld;
	}

}
