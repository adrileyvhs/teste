package com.java052023;

import com.java052023.projection.CustomerProjetction;
import com.java052023.repositorie.ConstumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Java052023Application implements CommandLineRunner {
    @Autowired
    private ConstumerRepository constumerRepository;
    public static void main(String[] args) {

        SpringApplication.run(Java052023Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<CustomerProjetction> list = constumerRepository.localizar1("US");
        for (CustomerProjetction obj : list){
            System.out.println(obj.getfirst_Name());
        }

        System.out.println( "Total de Registros : " + list.stream().count());
    }
}
