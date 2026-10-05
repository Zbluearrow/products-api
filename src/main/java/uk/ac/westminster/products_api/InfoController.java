package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Week 1 stretch task controller.
 *   GET /info -> a short description of the application
 */

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "Products API - a Spring Boot REST application for 5COSC019W Object Oriented Programming";
    }

}
