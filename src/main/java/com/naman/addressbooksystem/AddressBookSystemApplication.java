package com.naman.addressbooksystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressBookSystemApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(AddressBookSystemApplication.class, args);
        log.info("Address Book App Started in {} Environment",context.getEnvironment().getProperty("environment"));
        log.info("Address Book User DB User is {}",context.getEnvironment().getProperty("spring.datasource.username"));
    }

}
