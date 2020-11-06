package com.example.demo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
	
Logger log=LoggerFactory.getLogger(LoggerController.class);
	
	@GetMapping("/")
	public String greatLogger()
	{
		log.debug("this is a debug message");
		log.error("its a error");
		log.info("logger information for developer");
		
		log.trace("hey developer trace your code");
		log.warn("warning message ,don't repeat again");
		
		return "see logs for verification";
		
	}

}
