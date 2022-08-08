package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 조건식 ? true인 경우 : false인 경우
		String result = num > 0 ? "양수 입니다." : (num < 0 ? 
				"음수 입니다." : "0 입니다.");
		
		System.out.println(result);
		
		
	}

}
