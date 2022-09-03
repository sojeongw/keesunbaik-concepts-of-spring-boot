package me.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @CrossOrigin(origins = "http://localhost:18080")
    @GetMapping("/cross-origin")
    public String crossOrigin() {
        return "crossOrigin";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
