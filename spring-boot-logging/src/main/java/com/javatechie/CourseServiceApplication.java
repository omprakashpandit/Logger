package com.javatechie;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseServiceApplication {
private static final Logger logger=LoggerFactory.getLogger(CourseServiceApplication.class);
	public static void main(String[] args) {
		logger.info("Starting");
		SpringApplication.run(CourseServiceApplication.class, args);
		for(int i=1;i<10;i++) {
		logger.info("INFO/DEBUG/TRACE-green");
		logger.error("ERRROR/FATAL-red");
		logger.warn("WARN-yellow");
		logger.info("End.");
		}
	}

}
