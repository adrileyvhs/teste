package com.java052023.services;


public class TaxServiceUs extends TaxService{
    @Override
   public double tax(double valor){
       return  valor *0.15 - 0.3;
   }
}
