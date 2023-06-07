package com.java052023.services;

import org.springframework.stereotype.Service;


public class Previdencia {
    public  double desconto(double valor){
        return valor * 0.1;
    }
}
