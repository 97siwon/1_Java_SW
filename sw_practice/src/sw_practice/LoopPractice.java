package sw_practice;

import java.util.Scanner;

public class LoopPractice {

	public void ex0() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요. : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i<=num; i++) {
			if(i % 2 == 0 || i % 3 ==0) {
				System.out.print(i + " ");
				
				if(i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		
		System.out.print("\ncount : " + count);
		
	}
	
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + num2/num1);
		System.out.println("남는 사탕 개수 : " + num2%num1);
		
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int ban = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int num = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %0.2f점 입니다.", grade, ban, num, name, gender, score);	
		
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0 입니다.");
		} else if(num > 0) {
			System.out.println("양수 입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
		
	}
	
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum/3.0;
		
		if(kor >= 40 || math >= 40 || eng >= 40 || avg >= 60) {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("합격");
			
		} else {
			System.out.println("불합격");
		}
	
	}
	
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		if(age < 0 || age > 100) {
			System.out.println("잘목 입력 하셨습니다.");
		} else if(height < 140.0) {
			System.out.println("적정 키가 아닙니다.");
		} else if(age < 12) {
			System.out.println("적정 나이가 아닙니다.");
		} else {
			System.out.println("탑승가능");
		}
		
	
	}
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		for(int i = num1 ; i <= num2 ; i++ ) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 합: %d \n", num1, num2, sum);
	
	}
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			
			System.out.print("입력 " + i + " : ");
			sum += sc.nextInt();
		}
		
		System.out.println("합계 : " + sum );

	}
	
	public void ex9() {
		
		for(int i = 1; i<=20;i++) {
			if(i%5==0) {
				System.out.print("(" + i + ") ");
			}else {
				System.out.print(i+" ");
			}
			
		}
	
	}
	
	public void ex10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("잘못");
		} else {
			for(int i = 1;i<=9;i++) {
				System.out.printf("%dX%d=%d\n", num, i, num*i);
			}
		}
	
	}
	
	public void ex11() {
		
		for(int i = 1; i<=4 ; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
	
	public void ex12() {
		
		for(int row = 1; row<=9;row++ ) {
			for(int col = 1; col <= 9; col++) {
				System.out.printf("%dX%d=%2d ", row, col, row*col);
			}
			System.out.println();
		}	
	}
	
	
	public void ex13(){
		
		for(int row = 1;row<=4 ;row++) {
			for(int col = 1; col <= row ; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	
	}
	
	public void ex14() {
		
		for(int row = 4; row >= 1 ;row--) {
			for(int col = 4; col >= row ; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public void ex15() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력된 정수 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
	
	public void ex16() {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	public void ex17() {
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1 ; i <= 20; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
				sum += i;
				count++;
				
			}
			
			
		}
		System.out.println("\nsum : " + sum);
		System.out.println("count : " + count);
	
	}
	
	public void ex18() {
		
		int count = 1;
		
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=4;j++) {
				System.out.printf("%3d", count++);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
