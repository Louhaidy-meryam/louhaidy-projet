package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

//    echo "# louhaidy-projet" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Louhaidy-meryam/louhaidy-projet.git
//    git push -u origin main
    @GetMapping("/welcome")
    public  String welcome(){
        return "welcome to javatechie" ;
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
