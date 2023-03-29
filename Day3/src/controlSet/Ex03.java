package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//중립 조건문: 조건문안에 또 조건문을 작성하는 방식
		// -세부적인 조건 처리에 사용
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
			
			if (num %3 == 0) {
				System.out.println("짝수이며 3의 배수");
			}
			else {
				System.out.println("짝수이지만 3의 배수는 아님");
			}
		}
		else {
			System.out.println("홀수");
			
			if (num % 3 == 0) {
				System.out.println("홀수이며 3의 배수");
			}
			else {
				System.out.println("홀수지만 3의 배수는 아님");
			}
		}
		
		sc.close();
	}
}
