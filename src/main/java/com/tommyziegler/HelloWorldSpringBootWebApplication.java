package com.tommyziegler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tommyziegler.com
 * 
 *         This is the Main Bootstrap class for the spring-boot project
 * 
 * 
 */

@EnableAutoConfiguration
@ComponentScan("com.tommyziegler")
public class HelloWorldSpringBootWebApplication {

	/**
	 * Entrance method for Spring-Boot project of springsource
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldSpringBootWebApplication.class, args);
	}
}
