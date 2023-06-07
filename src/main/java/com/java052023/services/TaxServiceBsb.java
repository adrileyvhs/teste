package com.java052023.services;


public class TaxServiceBsb extends TaxService{
    @Override
   public double tax(double valor){
       return  valor *0.15;
   }
}
