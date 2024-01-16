package com.randomnumbergenerator.RandomNumberGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestRandomNumberGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.from(RandomNumberGeneratorApplication::main).with(TestRandomNumberGeneratorApplication.class).run(args);
	}

}
