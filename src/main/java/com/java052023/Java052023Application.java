package com.java052023;
import com.java052023.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.CustomerService;

@SpringBootApplication
public class Java052023Application implements CommandLineRunner {
    @Autowired
    private SalaryService salaryService;

    public static void main(String[] args) {
        SpringApplication.run(Java052023Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
         System.out.println("SALARIO:  " + salaryService.netSalary(4000));
    }
}