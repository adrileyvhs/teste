package com.java052023.dto;

import com.java052023.projection.CustomerProjetction;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CustomerDto {
    private  String first_Name;

public  CustomerDto(CustomerProjetction customerProjetction) {
       first_Name = customerProjetction.getfirst_Name();
}
}