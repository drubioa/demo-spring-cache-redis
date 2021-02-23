package com.example.demo.controller;

import com.example.demo.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    final ExampleService exampleService;

    @GetMapping
    @RequestMapping("example/{value}")
    public Long example(@PathVariable Long value) {

        return exampleService.example(value);
    }
}
