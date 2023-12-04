package com.ll.sbmission20231121;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

//findAll
	//: question 테이블 에 저장된 모든 데이터 조회 하기 위한 메소드
	//데이터 사이즈가 2건인지. => assertEquals(기대값, 실제값) ? 테스트 성공 : 테스트 실패
	//```void testJpa(){
	//		List<Question> all = this.questionRepository.findAll();
	//		assertEquals(2, all.size());
	//		Question q= all.get(0);
	//		assertEquals("sbb가 무엇인가요?", q.getSubject());

//findByID 는 리턴 타입 X, Optional 임
	//Optional 은 null 을 유연 하게 처리 하는 클래스
	//isPresent 로 null 이 아님 get 으로 실제 Question 객체 값을 얻음.
	//```void testJpa(){
	//		Optional<Question> oq = this.questionRepository.findById(1);
	//		if(oq.isPresent()){
	//			Question q= oq.get();
	//			assertEquals("sbb가 무엇인가요?", q.getSubject());	}

//findBySubject
	//메소드 선언 만으로 구현은 하지 않고 실행 가능
	//JpaRepository 를 상속한 QuestionRepository 객체가 생성 될때만 가능.
	//```Question findBySubject(String subject);```
	//스프링 이 자동 으로 QuestionRepository 객체 생성. 이때 프록시 패턴 사용됨.

//findBySubjectAndContent
	//QuestionRepository 에 객체 넣어 주기
	//```Question findBySubjectAndContent(String subject, String content);```
	//혼자 해보기 성곧ㅇ ㅎㅎ

//findBySubjectLike
	//특정 문자열 포함된 데이터 조회
	//QuestionRepository 에 객체 생성
	//문자열 로
	//```List<Question> findBySubjectLike(String subject);```
	//```void testJpa(){
	//			List<Question qList = this.questionRepository.findBySubjectLike("sbb%");
	//			Question q = qList.get(0);
	//			assertEquals("sbb가 무엇인가요?", q.getSubject());

//데이터 수정하기
	//assertTrue(값) 은 값이 true인지 테스트
	//this.questionRepository.save(q)처럼 리포지터리의 save 메소드 사용.
	@Test
	void testJpa(){
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setSubject("수정된 제목");
		this.questionRepository.save(q);


	}

}
