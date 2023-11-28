package com.ll.sbmission20231121;
import com.ll.sbmission20231121.Answer;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface AnswerRepository extends JpaRepository<Answer, Integer> {

    // Bean -> Spring Container
    // AnswerRepository 객체를 Spring Data JPA의 내부 로직을 이용해서 객체를 생성한 다음에 Spring Container에 등록해서 사용한다.

}
