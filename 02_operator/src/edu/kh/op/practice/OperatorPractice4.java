package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("합계 : " + sum);
		
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		String result = num1 >= 40 && num2 >= 40 && num3 >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
		

	}

}
