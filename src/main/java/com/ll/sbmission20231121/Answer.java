package com.ll.sbmission20231121;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //답변의 고유 번호
    @Column(columnDefinition  = "TEXT")
    private String content;
    //답변 내용
    private LocalDateTime createDate;
    //답변 작성 일시
    @ManyToOne
    private Question question;
    //어떤 질문에 대한 답변 인지 알기 위한 질문 속성



}
