package com.java052023.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMERS")
@Entity
public class customers {
    @Id
    private int id;
    private String firstName ;
    private String lastName;
    private String email ;
    private String gender ;
}
