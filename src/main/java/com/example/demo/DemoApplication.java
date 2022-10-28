package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        userRepository.save(new User("Tirion", "Lanister",42,"Man"));
//        userRepository.update(new User(2L,"Tirion", "Lanister",20,"Man"));
//        userRepository.getAll().forEach(System.out::println);
//        userRepository.getByAge(20).forEach(System.out::println);
//        System.out.println(userRepository.findById(1L));
//        userRepository.delete(4L);
    }
}
