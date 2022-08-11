package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
		
		// break 문 : 가장 가까운 반복문을 빠져 나가는 구문
		
		for(int i = 1; i<=10000; i++) {
			System.out.println(i);
			
			// i가 20일 때 반복 종료
			
			if(i == 20) {
				break;
			}
		}
		
		System.out.println("======================");
		
		for(int row = 1; row <= 5; row++) {
			
			for(int col = 1; col<=30; col++) {
				System.out.printf("(%d, %d) ", row, col);
				
				if(col ==3) {
					break;
				}
			}
			
			System.out.println();
			
			if(row ==3) {
				break;
			}
		}
		
	}
	
	
	public void ex2() {
		
		// 0이 입력될 때 까지의 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) { // 조건식에 강제로 true 작성 == 무한 굴레
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			
			sum += input; // 누적
			
		}
		
		System.out.println("합계 : " + sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다.
		
	}
	
	
	
	public void ex3() {
			
			// "exit@" 문자열이 입력될 때까지 문자열 누적하기
			
			Scanner sc = new Scanner(System.in);
			
			String str = ""; // 빈 문자열
			
			System.out.println("--- 문자열 입력 (종료 시 exit@ 입력) --- ");
			while(true) {
				
				String input = sc.nextLine(); // 한 줄 입력
				
				// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다!
				// -> String은 기본 자료형 X, 참조형 O
				
				// -> 참조형은 A.equals(B) 을 사용하여 값을 비교할 수 있다.
				
				// A.equals(B)  <=> 같은 의미 <=>    A == B
				if(input.equals("exit@")) {
					break;
				}
				
				str += input + "\n"; // 누적하면서 줄 바꿈 
				
			}
			
			System.out.println(str);
	}
	
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까지 5의 배수를 제외하고 출력 (continue 사용)
		for(int i = 1; i<=30; i++) {
			if(i % 5 == 0) {
				continue; // 다음 반복으로 이동(증감식 부분으로 이동)
			}
			
			System.out.println(i);
		}
		
	}
	
	
	public void ex5() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 멈춤
		
		for(int i=1; i <= 100; i++) {
			if(i % 5 == 0) {
				
				if (i == 40) {
					System.out.println(i);
					break;
				}
				
				continue;
			}
	
			System.out.println(i);
			
			
		}
	}
	
	
	public void upDownCame() {
		
		// 프로그램 시작 시 1~50 사이의 임의의 수 (난수)를 하나 생성하여
		// 사용자가 몇 회만에 맞추는지 카운트
		
		// 만약 틀렸을 경우 난수가 입력한 수보다 크면 UP/ 작으면 DOWN 출력
		
		// (임의의 수 : 30 )
		// ex) 
		// 1번 입력 : 10
		// UP
		
		// 2번 입력 : 40
		// DOWN
		
		// 3번 입력 : 30
		// 정답 입니다! (총 입력 횟수 : 3회)

		// while문, break
		
		// 난수 생성 : Math.random() -> 자바에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0      0.0 이상 1.0 미만의 난수를 생성(double형)
		
		int ran = (int)(Math.random() * 50 + 1);
		// 0.0 <= x < 1.0
		// 0.0 <= x < 50.0
		// 1.0 <= x < 51.0
		// 1 <= x < 51   ------> 1~50 사이의 난수
		
		System.out.println(ran);
		
		Scanner sc = new Scanner(System.in);
		
		
		// 시원 풀이
//		int input = 0;
//		
//		int count = 1;
//		
//		while(ran != input) {
//			
//			System.out.print(count++ + "번 입력 : ");
//			input = sc.nextInt();
//			
//			if(ran == input) {
//				System.out.println("정답 입니다! (총 입력 횟수 : " + (count-1) + "회)");
//			} else {
//				if (ran > input) {
//					System.out.println("UP");
//				} else {
//					System.out.println("DOWN");
//				}
//			}
//		}
//		
		// 선생님 풀이
		int count = 1;
		
		while(true) {
			System.out.print(count + "번 입력 : ");
			int input = sc.nextInt();
			
			if(ran == input) { // 난수 = 입력값
				
				System.out.printf("정답 입니다! (총 입력 횟수 : %d회) \n", count);
				break; // while문 종료
				
			} else if(ran > input) { // 난수 > 입력값
				
				System.out.println("UP");
				
			} else { // 난수 < 입력값
				
				System.out.println("DOWN");
			}
			
			count++;
		}
		
	}
	
	
	
}