package com.javainuse;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class H2databaseApplication {

    private static final Logger myLog = log;

	public static void main(String[] args) {
        SpringApplication.run(H2databaseApplication.class, args);
        myLog.warn("warn");
        myLog.debug("debug");
        myLog.info("info");
        myLog.trace("trace");
    }
}
