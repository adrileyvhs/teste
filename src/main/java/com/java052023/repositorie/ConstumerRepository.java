package com.java052023.repositorie;

import com.java052023.entities.customers;
import com.java052023.projection.CustomerProjetction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConstumerRepository extends JpaRepository<customers, Integer> {

    @Query(nativeQuery = true,value =  " SELECT first_Name from  customers" +
                                       " WHERE state= :state ")

      List<CustomerProjetction> localizar1(String state);
}
