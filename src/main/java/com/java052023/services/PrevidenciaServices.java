package com.java052023.services;

import org.springframework.stereotype.Service;

@Service
public class PrevidenciaServices {
    public  double desconto(double valor){
        return valor * 0.1;
    }
}
