package com.springboot.rest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testLog(){

        logger.debug("This DEBUG LOG");
        logger.info("This info LOG");
        logger.warn("This WARN LOG");
        logger.error("This ERROR LOG");
        return "Logs generated successfully";
    }
}
