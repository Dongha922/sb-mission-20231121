package com.ll.sbmission20231121;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.time.LocalDateTime;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbMission20231121ApplicationTests {
	@Autowired
	//객체 주입 setter 대신 사용
	private QuestionRepository questionRepository;

//findByID 는 리턴 타입 X, Optional 임
	//Optional 은 null 을 유연하게 처리 하는 클래스
	//isPresent로 null 이 아님 get으로 실제 Qustion 객체 값을 얻음.
	@Test
	void testJpa(){
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()){
			Question q = oq.get();
			assertEquals("sbb가 무엇인가요?", q.getSubject());
		}
	}

}
