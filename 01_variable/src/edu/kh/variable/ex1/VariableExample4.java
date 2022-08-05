package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/* 형변환(casting) : 값의 자료형을 변환하는 것
		 * 
		 * 형변환은 왜 필요한가?
		 * -> 컴퓨터의 값처리 원칙을 위배하는 경우 이를 해결하기 위해
		 * 
		 * 
		 * 자동 형변환
		 * - 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		 *   [컴파일러(번역기)]가 자동으로 
		 *   [값의 범위]가 작은 값을 큰 자료형으로 변환 
		 * 
		 */
		
		// 자동 형변환 확인1
		int num1 = 10;
		long num2 = 100L;
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 110 -> long형
		
		// 자동 형변환 확인2
		int num3 = 300;
		double num4 = 1.1;
		
		System.out.println(num3 + num4); // 301.1 -> double형
		
		double result = num3 + num4;
		             // 300 + 101
		             // 300.0(double) + 1.1(double)
		             // 301.1(double)
		
		// Type mismatch: cannot convert from double to int
		
		// 자동 형변환 확인3
		// char -> int 
		
		int num5 = 'a'; // 대입도 연산이다.
		// int = char
		
		System.out.println(num5); // 97
		
		char ch = 97; // 형변환 예외 상황(큰 -> 작은쪽으로 자동 형변환)
		System.out.println("ch : " + ch);
		
		char ch2 = '백';
		int result2 = ch2;
		
		System.out.println(ch2 + " Unicode Number : " + result2);
		
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("*** 강제 형변환 ***");
		
		double temp = 3.14;
		int result3 = (int)temp; // 값의 범위가 큰 double -> int 형변환
		
		System.out.println("result3 : " + result3); // 3 (소수점 버림 처리)
		
		
		int temp2 = 290;
		byte result4 = (byte)temp2; // int -> byte 강제 형변환
		
		System.out.println("result4 : " + result4); // 34
		
		
		// 강제 형변환의 다른 사용 예시
		
		// ** 강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능 **
		int iNum1 = 1;
		int iNum2 = 2;
		
		System.out.println( iNum1 / iNum2 );
		                 //  1  /   2   =  0
		                 // int /  int  =  int
		
		// 강제 형변환과 자동 형변환 동시에 사용
		System.out.println( (double)iNum1 / iNum2 );
		                 //  1.0  /  2   = 0.5 
		                 // double / int = double 
		                 //      -> double
		
		
		System.out.println(  (char)65  ); // int -> char 강제 형변환
		System.out.println(  (int)'A'  ); // char -> int 강제 형변환
		
		
		// 변수와 메모리(RAM) 구조(Static / Heap / Stack)
		// ** 지역변수는 메모리 중 STACK 영역에 생성된다. **
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
