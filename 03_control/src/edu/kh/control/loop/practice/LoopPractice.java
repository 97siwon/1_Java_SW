package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = 1; i <= num; i++) {
				
			System.out.print(i + " ");
			
			}
			
		}
		
	}
	
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = num; i >= 1; i--) {
				
			System.out.print(i + " ");
			
			}
			
		}
	}
	
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요. : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " ");
			}
			
		}
		
		System.out.print("= " + sum);
			
	}
	
	public void ex4() {
//		// 선생님 풀이1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 숫자 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 숫자 : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 < 1 || num2 < 1) { // num1, num2 중에 1 미만이 있는가?
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//			
//		} else {
//			if(num1 < num2) {
//				for(int i = num1 ; i <= num2 ; i++ ) {
//					System.out.print(i + " ");
//				}
//			} else {
//				for(int i = num2; i <=num1 ; i++) {
//					System.out.print(i + " ");
//				}
//			}
//		}
//		
//		
//		// 선생님 풀이2
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 숫자 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 숫자 : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 < 1 || num2 < 1) { // num1, num2 중에 1 미만이 있는가?
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//			
//		} else { // 둘 다 1미만이 아니다.
//			int start = num1;
//			int end = num2;
//			
//			if(num1 > num2) { // 먼저 입력한 숫자가 크면 start / end를 바꿈
//				start = num2;
//				end = num1;
//			}
//			
//			for(int i= start; i <= end; i++) {
//				System.out.print(i + " ");
//			}
//		}
//
//		
//		// 선생님 풀이3
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 숫자 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 숫자 : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 < 1 || num2 < 1) { // num1, num2 중에 1 미만이 있는가?
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//			
//		} else { // 둘 다 1미만이 아니다.
//			//  8       4
//			if(num1 > num2) {
//				
//				// 두 변수의 값 교환
//				int temp = num1; // temp : 8 / num1 : 8 / num2 : 4
//				
//				num1 = num2; // temp : 8 / num1 : 4 / num2 : 4
//				
//				num2 = temp; // temp : 8 / num1 : 8 / num2 : 8
//			}
//			
//			for(int i= num1; i <= num2; i++) {
//				System.out.print(i + " ");
//			}
//		}		
		

		
		// 시원 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int j = num2; j <= num1; j++) {
					System.out.print(j + " ");
				}
			}
		}
		
	
	}
	
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("==== " + num + "단" + " ====");
		
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("%d X %d = %d \n", num, i, num*i );
		}
		
	}
	
	
	public void ex6() {
		// 선생님 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
			
			for(int dan = num ; dan <= 9 ; dan++) {
				System.out.println("==== " + dan + " 단 ====" );
				
				for(int i = 1; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n", dan, i , dan*i);
				}
				
				System.out.println(); // 단 사이 줄바꿈
				
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
		
		
//		// 시원 풀이
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 : ");
//		int num = sc.nextInt();
//		
//		if(num < 2 || num > 9) {
//			System.out.println("2~9 사이 숫자만 입력해주세요.");
//		} else {
//			for (int i = num; i <= 9 ; i++) {
//				System.out.println("==== " + i + "단" + " ====");
//				for(int j = 1; j <= 9; j++) {
//					System.out.printf("%d X %d = %d \n", i, j, i*j);
//				}	
//			}
//		}
	
	}

	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = num; row >= 1; row--) {
			for(int col = row; col >= 1; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
	
	
	
	public void ex9() { // *****
		// 시원 풀이
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//			for(int i = 1; i <= num ; i++) {
//				for(int j = 1; j <= num; j++) {
//					if(j <= num-i) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//					
//				}
//				System.out.println();
//			}
			
			
//		// 선생님 풀이1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();	
//			
//		for(int row = 1; row <= input ; row++) {
//			
//			// for문을 이용한 풀이
//			// for(int i = input - row ; i >= 1 ; i--)
//			for(int i = input -1; i >= row; i--) {
//				System.out.print(" ");
//			}
//			
//
//			for(int col = 1; col <= row; col++) {	
//				System.out.print("*");
//			}
//			
//			System.out.println(); // 줄바꿈
//		}
		
		
		// 선생님 풀이2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();	
			
		for(int row = 1; row <= input ; row++) {
			
			// if을 이용한 풀이
			for(int col = 1; col <= input; col++) {	
				
				if(col <= input - row) {
					
					System.out.print(" ");
					
				} else {
					System.out.print("*");
				}		
			}
			
			System.out.println(); // 줄바꿈
		}
		
			
	}
	
	
	public void ex10() { //*****
		
		// 선생님 풀이1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 위쪽 삼각형
		for(int row = 1 ; row <= input ;  row++) {
			
			for(int col = 1; col <= row ; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// 아랫쪽 삼각형
		for(int row = input - 1 ; row >= 1 ;  row--) {
			
			for(int col = 1; col <= row ; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
//		// 선생님 풀이2(어려운 버전)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		for(int row = 1; row <= input*2-1; row++) {
//			if(row<input) {
//				
//				for(int col = 1; col <= row; col++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int col = input; col > row-input; col--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

	
	}

	
	public void ex11() {
		// 선생님 풀이1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input ; row++) {
			
		// for문을 이용한 풀이
		// for(int i = input - row ; i >= 1 ; i--)
			for(int i = input -1; i >= row; i--) {
				System.out.print(" ");
			}

			for(int col = 1; col <= row * 2 -1; col++) {	
			System.out.print("*");
			}
		
			System.out.println(); // 줄바꿈
		}

	}
	
	
	public void ex12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1; col <= input; col++) {
				
				// 첫번째, 마지막줄/칸일 때만 출력
				if(row == 1 || row == input || col ==1 || col == input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public void ex13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요. : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다.
				if(i % 2 == 0 && i % 3 == 0) {
					count++; // count 증가
					
				}
			}
		}
		
		System.out.println("\ncount :" + count);
	}

}
