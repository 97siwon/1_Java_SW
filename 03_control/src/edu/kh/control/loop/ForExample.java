package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	/* for문
	 * -끝이 정해져 있는 경우 사용하는 반복문
	 *  (== 반복 횟수가 지정되어 있는 경우)
	 * 
	 * 
	 * [작성법]
	 * 
	 * for(초기식 ; 조건식 ; 증감식){
	 * 	  조건식이 true일 때 반복 수헹할 코드
	 * }
	 * 
	 * 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * 조건식 : for문의 반복 여부를 지정하는 식
     * 조건식이 true인 경우에 반복을 수행함
     * 보통 초기식에 사용된 변수를 이용해서 조건식을 작성함.
     * 
	 * 증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
     * 보통 초기식에 사용된 변수를 증가/감소 시켜
     * 조건식의 결과를 변화게 만듦.
	 */
	
	
	
	public void ex1() {
		// for문 기초 사용법1
		// 1~10 까지 반복 출력
		
		for(int i = 1 ; i <= 10 ; i++) {
		//   1)초기식   ; 2,5)조건식  ; 4,7)증감식 
			
			// 3,6) 반복 수행할 코드
			System.out.println(i + "출력");
			
			// 1,2,3,4, 수행 후 -> 5~7 반복
		}
	
	}
	
	
	public void ex2() {
		// for 기초 사용법2
		
		// 5부터 12까지 1씩 증가하면서 출력
		for(int i = 5; i <= 12 ; i++) {
			System.out.println(i + "출력");
		}
		
		System.out.println("=============================");
		
		// 1부터 100까지의 모든 정수의 합
		
		int sum = 0; // 합계 저장용 변수
		// 왜 0으로 초기화 하는가?
		// -> 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어
		//    누적이 필요한 상황에서 기준점으로 사용하기 적합하다.
		
		for (int i = 1; i <= 100; i++) {
			
			// i 값이 1~100씩 1씩 증가
			// -> 이 i 값을 sum 변수에 계속 누적
			sum += i; // sum = sum + i;
			
		}
		
		System.out.println("1~100까지의 합 : " + sum);
	}
	
	
	public void ex3() {
		// for 기초 사용법3
		
		// 두 정수를 입력 받아
		// 두 정수 사이의 모든 정수 합을 출력
		// 단, 첫 번째 입력이 두 번째 입력보다 작아야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		
		int sum = 0; // 합계 저장용 변수
		
		for(int i = num1; i <= num2; i++) {
			sum += i; // 누적
			
		}
		
		System.out.printf("%d부터 %d까지의 합 : %d \n", num1, num2, sum);
	}
	
	
	public void ex4() {
		
		// for 기초 사용법4
		
		// 1부터 100까지 3씩 증가하며 출력
		// 1 4 7 10 13 16 19 22 25 28 31...
		
		for(int i = 1; i <= 100; i += 3) {
			
			// 1씩 증가 == i++ == i = i + 1
			
			System.out.print(i + " ");
		}
		
		System.out.println("\n===============================");
		
		// 10부터 20까지 0.5씩 증가
		
		for(double i = 10.0; i <= 20.0; i += 0.5) {
			System.out.print(i + " ");
		}
	}
	
	
	public void ex5() {
		
		// for문 +  char + 자동/강제 형변환 응용
		
		// A~Z까지 출력
		
//		for(int i = 'A' ; i <= 'Z'; i++) {
//			System.out.println((char)i);
//		}
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println( i );
		}
		
	}
	
	
	public void ex6() { //[응용]
		
		// 10부터 1까지 1씩 감소하면서 출력
		
		for(int i =10 ; i >= 1; i--) {
			
			System.out.println(i);
			
		}
	}
	
	
	public void ex7() { //[응용]
	
		// 입력, sum, for 응용
		
		// 정수 5개를 입력 받아 합계 구하기
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print("입력"+i+" : ");
			sum += sc.nextInt();
			// 입력 버퍼에서 다음 정수를 얻어와
			// sum 변수에 누적
			
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	
	public void ex8() {
		
		// ex7 응용
		
		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력
		
		// ex)
	    // 입력 받을 정수의 개수 : 3
	    // 입력 1 : 10
	    // 입력 2 : 20
	    // 입력 3 : 30
	    // 합계 : 60
	      
	    // ex)
	    // 입력 받을 정수의 개수 : 2
	    // 입력 1 : 10
	    // 입력 2 : 20
	    // 합계 : 30
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			
			System.out.print("입력"+i+" : ");
			sum += sc.nextInt();
		}
		
		System.out.println("합계 : " + sum);
	}
	
	
	
}