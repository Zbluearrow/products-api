package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Week 1 starter controller.
 *   GET /hello   -> a simple greeting
 *   GET /goodbye -> a simple farewell
 *   GET /status  -> a status message including today's date
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boot!";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from Spring Boot!";
    }

    @GetMapping("/status")
    public String status(){
        return "API is running - " + LocalDate.now().toString();
    }

}
