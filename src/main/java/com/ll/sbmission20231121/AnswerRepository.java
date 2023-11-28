package com.ll.sbmission20231121;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AnswerRepository extends JpaRepository<Answer, Integer> {

    // Bean -> Spring Container
    // AnswerRepository 객체를 Spring Data JPA의 내부 로직을 이용해서 객체를 생성한 다음에 Spring Container에 등록해서 사용한다.

}
