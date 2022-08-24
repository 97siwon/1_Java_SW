package edu.kh.poly.ex2.model.vo;


// 클래스 상속 : extends
// -> 부모가 완성한 기능을 자식이 물려 받아서 사용
// 자식 기능 + 부모 기능 (객체의 크기가 확장됨)


// 인터페이스 상속 : implements(구현하다)
// -> 부모가 이름만 있는 미완성 기능을 물려줌
// -> 자식이 이름만 있는 메서드를 구현(오버라이딩)해서 완성시켜야됨
public class LSW implements KH { // 이시원 (A반 학생)

	public LSW() {
		super();
	}
	
	
	
	@Override
	public void lesson() {
		
	System.out.println("A 강의장에서 JAVA 엔지니어 과정 수정");	
	}
}
