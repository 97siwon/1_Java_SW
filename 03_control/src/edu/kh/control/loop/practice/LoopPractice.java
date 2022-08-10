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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for (int i = num; i <= 9 ; i++) {
				System.out.println("==== " + i + "단" + " ====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d \n", i, j, i*j);
				}	
			}
		}
	
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
	
	
	
	public void ex9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.printf("%numc", "*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
