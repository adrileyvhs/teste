package com.java052023.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@AllArgsConstructor()
//@NoArgsConstructor
@Getter
@Setter
@Service
public class SalaryService {
    @Autowired
    private TaxService taxService ;
    @Autowired
    private PrevidenciaServices previdenciaServices;
    public double netSalary(double salariobBruto) {
       return  salariobBruto - taxService.tax(salariobBruto) - previdenciaServices.desconto(salariobBruto);
   }
}
