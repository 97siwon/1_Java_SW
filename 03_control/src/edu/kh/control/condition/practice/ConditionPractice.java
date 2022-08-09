package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) { // 짝수
				System.out.println("짝수입니다.");
			} else { // 홀수
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3;
		
		if(kor >= 40 && mat >= 40 && eng >= 40 && avg >= 60 ) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		int result = 0;
		
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			result = 31;
		break;
		
		case 4 : case 6 : case 9 : case 11 : 
			result = 30;
		break;
		
		case 2 : result = 28;
		break;
		
		default : result = -1;
		}
		
		if(result == -1) {
			System.out.println(num + "은 잘못 입력된 달입니다.");
		} else {
			System.out.printf("%d월은 %d일까지 있습니다." , num, result);
		}
		
	}
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요. : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요. : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		String result;
		
		if(BMI >= 30) {
			result = "고도 비만";
		} else if(BMI >= 25) {
			result = "비만";
		} else if(BMI >= 23) {
			result = "과체중";
		} else if(BMI >= 18.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}
		
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(result);
		
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int num1 = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int num4 = sc.nextInt();
		
		// 점수 비율
		double num11 = num1 * 0.2; 
		double num22 = num2 * 0.3;
		double num33 = num3 * 0.3;
		double num44 = num4;
				
		double sum = num11 + num22 + num33 + num44;
		
		if(sum < 70) {
			System.out.println("============== 결과 ================");
			System.out.println("중간 고사 점수(20) : " + num11);
			System.out.println("기말 고사 점수(30) : " + num22);
			System.out.println("과제 점수(30) : " + num33);
			System.out.println("출석 점수(20) : " + num44);
			System.out.println("총점 : " + sum);
			System.out.println("Fail [점수 미달]");
		} else if(num4 <= (num4 * 0.3)){
			System.out.println("Faile [출석 횟수 부족 (" + num4 + "/20)]" );		
		} else {
			System.out.println("============== 결과 ================");
			System.out.println("중간 고사 점수(20) : " + num11);
			System.out.println("기말 고사 점수(30) : " + num22);
			System.out.println("과제 점수(30) : " + num33);
			System.out.println("출석 점수(20) : " + num44);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}
		
		
	}
	
	
	
}
