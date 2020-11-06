package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByUsingXMl {
	
	
	Logger log=LoggerFactory.getLogger(ByUsingXMl.class);
	
	
	
	@GetMapping("/")
	public String logger()
	{
		
		
		log.debug("debug message ");
		log.error("error message");
		log.trace("trace message");
		log.info("info here");
		log.warn("warning");
		return "find logs";
	}

}
