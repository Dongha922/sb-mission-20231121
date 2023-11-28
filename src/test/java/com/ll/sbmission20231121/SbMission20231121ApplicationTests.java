package com.ll.sbmission20231121;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbMission20231121ApplicationTests {
	@Autowired
	//객체 주입 setter 대신 사용
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject ("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다.");
		q1.setCreateDate(LocalDateTime.now());

		this.questionRepository.save(q1);//첫번째 질문 저장


		Question q2 = new Question();
		q2.setSubject ("스프링부트모델질문입니다");
		q2.setContent("id는 자동 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);//두 번째 질문 저장
	}
//	@Test
//	void testJpa(){
//		List<Question> all =this.questionRepository.findAll();//저장된거 다 찾아와
//		assertEquals(2,all.size());//전체가 2일텐데 맞나?
//
//		Question q= all.get(0);//젤 처음꺼 가져와
//		assertEquals("sbb가 무엇인가요?", q.getSubject());//젤 처음꺼 제목 이거일텐데 맞나?
//	}

}
