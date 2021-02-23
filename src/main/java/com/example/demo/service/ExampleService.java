package com.example.demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ExampleService {

    final Integer waitSeconds = 5;

    @Cacheable(value="example", key="#n")
    public Long example(Long n) {

        // Example of heavy service wait 5 seconds after return value
        try {
            Thread.sleep(waitSeconds * 1000);
            log.info("return value after {} seconds", waitSeconds);
            return n;
        } catch (Exception e) {
            log.error(e);
            throw new RuntimeException(e);
        }
    }
}
