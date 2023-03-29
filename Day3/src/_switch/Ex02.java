package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// Java의 switch는 문자열도 가능
		Scanner sc = new Scanner(System.in);
		String menu;
		
		
		System.out.println("------------ 메뉴 ------------");
		System.out.println("\t 1. 등심까스");
		System.out.println("\t 2. 안심까스");
		System.out.println("\t 3. 치즈까스");
		System.out.println("\t 4. 생선까스\n");
		
		System.out.print(">>> ");
		menu = sc.next();
		
		switch (menu) {
		case "등심까스":
			System.out.println("등심까스 주문~");
			break;
		case "안심까스":
			System.out.println("안심까스 주문~");
			break;
		case "치즈까스":
			System.out.println("치즈까스 주문~");
			break;
		case "생선까스":
			System.out.println("생선까스 주문~");
			break;
		default:
			System.out.println("없는 메뉴 입니다");
		}
		
		sc.close();
	}
}
