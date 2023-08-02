package com.it_shaala;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "New_Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int question_Id;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

}
