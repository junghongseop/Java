package controlSet;

import java.util.Scanner;
/*
 * 제어문: 코드의 흐름을 제어하는 구문
 * 1. 조건문: 참/거짓에 따라서 코드의 흐름을 분기
 * 2. 반복문: 참/거짓에 따라서 코드를 루프
 * 3. 보조 제어문: 조건문과 반복문을 보조하는 제어문		
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		// 제어문 if: 조건식이 참이면 종속문자를 수행
		// 종속문장: 특정 영역에 포함된 구문. {}로 묶여 있음
		
		// 조건문 else: 위의 조건이 거짓이면 수행
		// -if의 보조 구문으로 단도록으론 사용이 불가능함
		// -조건식을 가질수 없음
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인 ");
		}
		
		else {
			System.out.print("미성년자 ");
		}
		
		System.out.println("입니다");
		
		sc.close();	
	}
}
