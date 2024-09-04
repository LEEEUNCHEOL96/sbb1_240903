package com.example.sbb1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id // 답변의 고유 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;

    @Column(columnDefinition = "TEXT")  // 답변의 내용은 TEXT 형태의 길이제한 없음
    private String content;

    private LocalDateTime createDate; // 답변의 작성 일시


    @ManyToOne // N : 1 관계
    private Question question;
}