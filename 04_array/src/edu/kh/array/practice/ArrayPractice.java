package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void ex1() {
		
		// 길이가 9인 배열 선언
		int[] arr = new int[9]; // index 0~8
		
		for(int i=0; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		
		int sum = 0;
		for(int i=0; i<9; i++) { 
			System.out.print(arr[i] + " ");
			if(i%2==0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	
	}
	
	
	public void ex2() {
		
		// 길이가 9인 배열 선언
		int[] arr = new int[9]; // index 0~8
		
		for(int i=0; i<arr.length ; i++) {
			arr[i] = 9-i;
		}
		
		int sum = 0;
		for(int i=0; i<9; i++) { 
			System.out.print(arr[i] + " ");
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
		
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	
	}
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.print("입력 " + i + " : " );
			arr[i] =sc.nextInt();
			
		}
				
			System.out.print("검색할 값 : ");
			int input = sc.nextInt();
			
			boolean flag = true;
	
			for(int i=0; i < arr.length; i++) {
				
				if( arr[i] == input) { // arr[i] 값이 입력 받은 값과 같다면
					System.out.println(i + "번째 인덱스에 존재합니다.");
					flag = false; // flag 값을 변경
					break; // 중복 데이터가 없으면 추가 검색을 하지 않아도 됨 
				} 
			}
			
			if(flag) {
				System.out.println("일치하는 값이 존재하지 않습니다.");
			}
				
	}
	
	
	// index가 들어가는 이유??
	public void ex5() { // ***** 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] arr = new char[str.length()];
		
		String index = "";
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			if(ch == arr[i]) {
				index += i + " ";
				count++;
			}
		}
		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch+ " 개수 : " + count);
	
		
	}
	
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		int[] arr = new int[sc.nextInt()] ;
		
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			int num = sc.nextInt();

			arr[i] = num;
			sum += num;
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);
	
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] charArr = new char[str.length()];
		
		
		for(int i = 0; i < charArr.length - 6 ; i++) {
			charArr[i] = str.charAt(i);
			System.out.print(charArr[i]);
		}
		
		for(int i = charArr.length - 6; i < charArr.length;i++) {
			charArr[i] = '*';
			System.out.print(charArr[i]);
		}
			
	}
	
	
	// 오름차순, 내림차순???
	public void ex8() { //*****
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		while(true) {
			if(num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			} else {
				
				
				
			}
		}
			
	}
	
	public void ex9() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	// 최소값 출력이 안되는 이유???
	public void ex10() { //*****
		
		int[] arr = new int[10];
		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()*10 + 1);
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) { 
				min = arr[i];
			}

			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);	
		
	}
	
	
	public void ex11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()*10 + 1);
			// 1~10 사이의 난수

			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");			
		}
	
	}
	
	public void ex12() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random()*45 +1);
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}
	
	
	
	// 중복 제거???
	public void ex13() { //*****
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] charArr = new char[str.length()];
		
		System.out.print("문자열에 있는 문자 : ");
		
		String result = "";
		
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = str.charAt(i);
			
			
			
			System.out.print(charArr[i] + " ");
		}
	
	}
	
	public void ex14() { // *****
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요. : ");
		String[] strArr = new String[sc.nextInt()];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print((i+1) + "번째 문자열  : ");
			strArr[i] = sc.next();
			
			
			
		}
	
	}
	
	
	public void ex15() {
		
		int[][] arr = new int[3][3];
	
		for(int row=0; row<arr.length - 1; row++) {
			for(int col=0; col<arr[row].length - 1; col++) {
				
			}
		}
		
		// 출력용
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
				System.out.printf("(%d, %d)", row, col);
		
			}
			System.out.println();
		}
	
	}
	
	
	public void ex16() {
		
		int count = 1;
		
		int[][] arr = new int[4][4];
		
		for(int row=0; row<arr.length - 1; row++) {
			for(int col=0; col<arr[row].length - 1; col++) {
				
			}
		}
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
				System.out.printf("%3d", count++);
		
			}
			System.out.println();
		}

	}
	
	
	public void ex17() {
		
		int[][] arr = new int[4][4];
		
		System.out.println(arr.length);
		
		int count = 16;
		
		for(int row=0; row<arr.length - 1; row++) {
			for(int col=0; col<arr[row].length - 1; col++) {
				
			}
		}
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
				System.out.printf("%3d", count--);
		
			}
			System.out.println();
		}	
		
	}
	
	public void ex18() { 
		
		int[][] arr = new int[4][4];
		
		for(int row = 0; row < arr.length -1; row++) {
			for(int col = 0; col < arr[row].length -1; col++) {
				
				// 난수 생성 
				int ran = (int)(Math.random()*10 + 1);
				arr[row][col] = ran;
				
				// 각 행의 마지막 열
				arr[row][arr[row].length-1] += ran; // 생성된 난수 누적
				
				// 각 행의 마지막 행
				arr[arr.length-1][col] += ran; // 생성된 난수 누적
				
				// 마지막 행, 마지막 열
				arr[arr.length-1][arr[row].length-1] += ran; // 생성된 난수 누적
				
			}
		}
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
				System.out.printf("%3d",arr[row][col]);
		
			}
			System.out.println();
		}			
		
	}
	
	
	public void ex19() { //*****
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int rowNum = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int colNum = sc.nextInt();
		
		
		int[][] arr = new int[rowNum][colNum];
		
		for(int row = 0; row < arr.length - 1; row++) {
			for(int col = 0; col < arr[row].length -1; col++) {
				
				int ran = (int)(Math.random()*26+65);
				arr[row][col] = ran;
				
			}
		}	
		
		for(int row = 0; row < arr.length ; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				
				System.out.printf("%2d", (char)arr[row][col]);
				
			}
		}
	
	}
	
	
	public void ex20() { //*****
		
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int num = sc.nextInt();
		
		int[][] arr = new int[num][];
		
		for(int row=0; row<arr.length;row++) {
			
			System.out.print("열의 크기 : ");
			arr[row] = new int[sc.nextInt()];
			
			for(int col=0; col<arr[row].length ; col++) {
			}
			System.out.println();
		}
			
			
		}
		
	
		
	
}
