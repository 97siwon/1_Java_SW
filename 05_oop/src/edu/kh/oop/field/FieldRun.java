package edu.kh.oop.field;

import edu.kh.oop.field.model.vo.Student;

public class FieldRun {

	public static void main(String[] args) {

		// Student 객체 생성
		
		Student std1 = new Student();
		
		// std1이 참조하는 객체에 있는 name 필드에 "홍길동"을 대입
		std1.name = "홍길동";

		
		// Student 객체 또 생성
		
		Student std2 = new Student();
		std2.name = "이순신";
		
		System.out.println("[std1]");
		System.out.println("이름 : " + std1.name); 
		// std1이 참조하는 객체의 name 필드 값 출력
		
		System.out.println("학교명 : " + std1.schoolName);
		std1.study();
		
		
		System.out.println("[std2]");
		System.out.println("이름 : " + std2.name); 
		System.out.println("학교명 : " + std2.schoolName);
		std2.study();
		
		System.out.println("======================================");
		
		// 모든 학생 객체의 학교명 변경(static 미사용)
//		std1.schoolName = "KH대학 부속 고등학교";
//		std2.schoolName = "KH대학 부속 고등학교";
		
		// static (== 공유 영역) 사용
		std1.schoolName = "KH대학 부속 고등학교";
		
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		
	}

}
