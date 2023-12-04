package com.ll.sbmission20231121;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.desktop.QuitStrategy;
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

//findBYSubject
	//QuestionRepository 인터페이스 수정
	//메소드 선언만으로 구현은 하지 않고 실행 가능
	//JpaRepository를 상속한 QuestionRepository 객체가 생성 될때만 가능.
	//```Question findBySubject(String subject);```
	//스프링이 자동으로 QuestionRepository 객체 생성. 이때 프록시 패턴 사용됨.
	@Test
	void testJpa(){
		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(1, q.getId());
	}

}
