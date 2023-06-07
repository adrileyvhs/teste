package com.java052023.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor

public class SalaryService {
   private  TaxService  taxService  ;
   private  Previdencia previdencia ;

   public double salarioLiquido(double salariobBruto) {
       return  salariobBruto- taxService.tax(salariobBruto) - previdencia.desconto(salariobBruto);
   }
}
