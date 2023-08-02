package com.it_shaala;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int question_id;
    private String question;

    @OneToOne
    @JoinColumn(name = "a_Id")
    private Answer answer;
}
