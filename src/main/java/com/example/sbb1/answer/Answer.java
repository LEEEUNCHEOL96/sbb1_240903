package com.example.sbb1.answer;

import com.example.sbb1.question.Question;
import com.example.sbb1.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Answer {
    @Id // 답변의 고유 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;

    @Column(columnDefinition = "TEXT")  // 답변의 내용은 TEXT 형태의 길이제한 없음
    private String content;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime createDate; // 답변의 작성 일시
    private LocalDateTime modifyDate; // 답변의 수정 일시

    @ManyToOne // N : 1 관계
    private Question question;

    @ManyToMany  // 좋아요 기능
    Set<SiteUser> voter;
}
//1