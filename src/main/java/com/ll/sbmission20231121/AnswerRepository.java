package com.ll.sbmission20231121;
import com.ll.sbmission20231121.Answer;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //시도
@AllArgsConstructor//시도2
@Autowired//시도3
//public class AnswerRepository extends JpaRepository<Answer, Integer> { }

public class AnswerRepository implements JpaRepository<Answer, Integer> {

}
