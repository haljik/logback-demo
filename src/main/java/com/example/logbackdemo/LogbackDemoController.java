package com.example.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class LogbackDemoController {

    final Logger normalLogger = LoggerFactory.getLogger(this.getClass());
    final Logger operationLogger = LoggerFactory.getLogger("operation-logger");

    @RequestMapping
    String hello() {
        normalLogger.info("HELLO NORMAL LOGGER!!!");
        operationLogger.info("HELLO\tOperation\tLOGGER!!!\tSOME\tGREAT\tVALUABLE\tDATA");
        return "Hello world";
    }

}
