package com.quizapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "questions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private Integer correctOption; // Index 0, 1, 2, or 3
}