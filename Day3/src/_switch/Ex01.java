package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// switch : 값으로 코드를 분기
		// - 선택문이라고도 하며, 값은 정수와 문자열만 가능하다
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("메뉴 (1 ~ 3) ");
		menu = sc.nextInt();
		
		
		switch (menu) {		// 값은, 정수와 문자열만!!!
		case 1:
			System.out.println("1번 선택");
			break;			// '즉시' 제어문을 탈출
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("없는 메뉴 입니다");
		}
		
		sc.close();
	}
}
