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
@Table(name = "New_Answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answer_id;
    private String answer;

    @ManyToOne
    private Question question;
}
