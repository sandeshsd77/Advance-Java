package com.it_shaala;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "New_Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;


    @ElementCollection()
    @CollectionTable(name = "Emp_Address", joinColumns = @JoinColumn(name = "id"))
    private List<String>address;


    @ElementCollection
    @CollectionTable(name = "pphoneNumber",joinColumns = @JoinColumn(name = "id"))
    private List<Integer> phoneNumber;
}
