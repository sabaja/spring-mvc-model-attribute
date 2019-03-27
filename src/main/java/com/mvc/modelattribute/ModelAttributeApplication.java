package com.mvc.modelattribute;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ModelAttributeApplication {

	private static final Logger log = LoggerFactory.getLogger(ModelAttributeApplication.class);
	
	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = SpringApplication.run(ModelAttributeApplication.class, args);
		log.info("Started @[{}] \nHit enter to stop server", ctx.getDisplayName());
		System.in.read();
		ctx.close();
	}

}
