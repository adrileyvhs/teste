package com.java052023.dto;

import com.java052023.projection.CustomerProjetction;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CustomerDto {
    private String first_Name;
    private String lastName;
    private String email;
    private String gender;
    private String state;
    private String telefone;

    public CustomerDto(String state) {
        this.gender = gender;
    }

    //
//public  CustomerDto(CustomerProjetction customerProjetction) {
//       first_Name = customerProjetction.getfirst_Name();
//}
}