package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main(String[] args) {
		
		// 단축키 ctrl + alt + 방향키 위 or 아래 : 
		
		/* 출력 메서드
		 * 
		 * System.out.print("내용")
		 * -> () 안의 내용 출력 (줄바꿈X)
		 *  
		 * System.out.println("내용")
		 * -> () 안의 내용 출력 (줄바꿈O)
		 *
		 * System.out.printf("내용 + 패턴" , 패턴에 들어갈 값)
		 * 
		 */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
		
		String name = "이시원";
		int age = 26;
		char gender = '여';
		double height = 165;
		boolean tf = true;
		
		// 이시원님은 26세 여성, 키는 165cm입니다. (true)
		System.out.println(name + "님은 " + age + "세 " + gender 
				+ "성, 키는 " + height + "cm입니다. (" + tf + ")" );
		
		System.out.printf( "%s님은 %d세 %c성, 키는 %.1fcm입니다. (%b) \n" , name, age, gender, height, tf );
		// \n : 개행(줄바꿈)을 나타내는 탈출(escape) 문자
		
		System.out.println("줄 바꼈나요??");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
