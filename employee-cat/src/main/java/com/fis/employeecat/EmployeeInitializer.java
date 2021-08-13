package com.fis.employeecat;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class EmployeeInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    EmployeeInitializer(EmployeeRepository itemRepository) {
        this.employeeRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Alice", "Bob", "Christin", "Dom torreto", "Conner", "Jacob", "Cipher")
                .forEach(item -> employeeRepository.save(new Employee(item)));

        employeeRepository.findAll().forEach(System.out::println);
    }
    
    
}