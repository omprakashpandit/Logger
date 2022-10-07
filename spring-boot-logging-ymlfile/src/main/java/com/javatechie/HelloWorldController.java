package com.javatechie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
	private static final Logger logger=LoggerFactory.getLogger(HelloWorldController.class);
	@GetMapping("/hello")
	public String hello() {
		logger.info("Starting");
		for(int i=1;i<1000;i++) {
			logger.info("INFO/DEBUG/TRACE-green");
			logger.error("ERRROR/FTAL-red");
			logger.warn("WARN-yellow");
			logger.info("End.");
			}
		return "Done";
	}
}
