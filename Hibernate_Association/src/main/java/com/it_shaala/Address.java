package com.it_shaala;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private int pinCode;
    private String country;
}
