package com.java052023.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TaxService {
   public double tax(double valor){
       return  valor *0.2;
   }
}
