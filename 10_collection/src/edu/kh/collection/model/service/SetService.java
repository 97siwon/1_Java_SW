package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import edu.kh.collection.model.vo.Student;

public class SetService {

	/* Set(집합)
	 * - 순서를 유지하지 않음 (인덱스X)
	 * - 중복 데이터 저장 불가 (null도 1개만 저장 가능)
	 */
	
	
	public void ex1() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의 민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		
		// remove(Object value) : Set에 저장된 객체 중 value가 같은 객체 제거
		// -> boolean 반환
		//    제거 되면 true / 안되면 false
		set.remove("직방");
	
		
		System.out.println(set.toString());
		
		
		// Set에 저장된 요소 하나씩 얻어오기
		
		// 1. Iterator (반복자)
		
		// - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
		// --> 컬렉션에 저장된 객체를 임의의 순서로 하나씩 꺼내는 역할
		
		Iterator<String> it = set.iterator();
		
		// Set.iterator();
		// Set에 저장된  객체를 이용해서 Iterator 객체를 만들어 반환
		
		while( it.hasNext() ) {
			
			// hasNext() : 다음 값이 존재하면 true
			
			String temp = it.next();
			// next() : 다음 값을 얻어옴
			
			
			System.out.println(temp);
		}
		
		System.out.println("--------------------------------------");
		
		// 2. 향상된 for문
		for( String temp : set ) {
			System.out.println(temp);
		}
	}
	
	
	public void ex2() {
		
		/* Set에 저장된 객체가 중복임을 판단하는 방법
		 * 
		 * - 필드에 저장된 값이 모두 일치하면 중복으로 판단
		 *   -> 중복 판단에 사용하는 메서드는
		 *      Object.equals() 메서드의 오버라이딩된 메서드
		 *      -> Student 오버라이딩
		 */
		
		
		Set<Student> set = new HashSet<Student>();
		
		set.add( new Student("홍길동", 15, "서울시 중구", 'M', 50 ) );
		set.add( new Student("김길순", 25, "서울시 종로구", 'F', 100 ) );
		set.add( new Student("홍길동", 15, "서울시 중구", 'M', 50 ) );
		
		
		Student s1 = new Student("김길순", 25, "서울시 종로구", 'F', 100 );
		Student s2 = new Student("김길순", 25, "서울시 종로구", 'F', 100 );
		
		System.out.println( s1.equals(s2));
		
		for( Student s : set ) {
			System.out.println( s );
		}
			
	}
	
	
}
