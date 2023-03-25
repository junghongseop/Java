package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//nextline()으로 띄어쓰기도 입력 받을 수 있다
		// 1.next자료형(), next()
		// -space의 enter를 구분자로 인식
		// -이전에 남은 space, enter는 알아서 제거
		//
		// 2.nextline();
		// -enter를 구분자로 인식
		// -이전에 남은 enter를 제거하지 않음
		
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		
		System.out.print("문장 입력: ");
		str1 = sc.next();
		
		
		System.out.println("str1 = " + str1 +"\n");
		
		sc.nextLine();
		
		System.out.print("문장 입력: ");
		str2 = sc.nextLine();
		
		System.out.println("str2 = " + str2);
		
		
		
		sc.close();
	}
}
