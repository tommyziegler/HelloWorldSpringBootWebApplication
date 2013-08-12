package com.tommyziegler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tommyziegler.services.HelloWorldService;

@Controller
class HelloWorldController {

	HelloWorldService helloWorldService = null;

	@Autowired
	HelloWorldController(HelloWorldService helloWorldService) {
		Assert.notNull(helloWorldService);

		this.helloWorldService = helloWorldService;
	}

	@RequestMapping("/")
	@ResponseBody
	String helloWorld() {
		return helloWorldService.printAndReturn();
	}
}
