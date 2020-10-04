package com.cape.lib.management.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(value = "*")
@SpringBootApplication
public class LibraryManagementSystemApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryManagementSystemApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Library System Management Started...");
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
        LOGGER.info("Library System Management running...");
    }

}
