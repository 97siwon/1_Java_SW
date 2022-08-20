package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		LSW 이시원 = new LSW();
		// heap 영역에 LSW 클래스에 정의된 내용을 이용하여
		// LSW 객체 생성(할당)
		
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 이시원.name);
		System.out.println("나이 : " + 이시원.age);
		System.out.println("생년월일 : " + 이시원.birthday);
		
		// System.out.println("비밀번호 : " + 이시원.password);
		// The field LSW.password is not visible
		
		
		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		이시원.showPassword();
		
		// 기능 수행
		이시원.eat();
		이시원.study();
		이시원.plus(50, 100);
		
		
	}
	
}
