package com.ll.sbmission20231121;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import java.time.LocalDateTime;

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
    private Question question;
    //어떤 질문에 대한 답변 인지 알기 위한 질문 속성



}
