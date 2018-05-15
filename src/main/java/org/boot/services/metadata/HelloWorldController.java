package org.boot.services.metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String printHello() {
        System.out.println("HelloWorld!");

        return "Hello World!";
    }

    @GetMapping("/")
    public String printWorld() {
        System.out.println("World!!");

        return "World!!";
    }
}
