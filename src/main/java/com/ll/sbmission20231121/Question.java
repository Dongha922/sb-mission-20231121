package com.ll.sbmission20231121;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
//JPA 가 엔티티로 인식한다.


public class Question {
    @Id
    //데이터 구분을 위함.
    // JPA 에서 엔티티의 기본 키 값을 자동생성하는 방법을 지정하는 어노테이션.
    // 엔터티를 데베에 저장시에 해당 엔터티의 기본 키 값을 자동 생성후 이를 데베의 identity 컬럼에 의존해 할당
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //질문의 고유번호
    @Column(length = 200)
    //컬럼의 길이
    private String subject;
    //질문의 제목

    @Column(columnDefinition = "TEXT")

    //테이블의 열과 매핑 시 정의를 지정하는 어노테이션 . 열의 정의를 "text"로 지정
    //      글자수 제한 두지 않음 .
    private String content;
    //질문의 내용
    private  LockModeType createDate;
    //질문을 작성한 일시

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
