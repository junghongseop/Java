package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("이름 입력: ");
		name = sc.next(); //문자열은 그냥 next();
		
		System.out.println("당신의 이름은 " + name + "입니다\n");
		
		//문자열은 문자가 나열된 형태
		// -문자열에는 가장 앞에 부터 0번이 할당되어 있음
		System.out.println("name[0] = " + name.charAt(0));
		System.out.println("name[1] = " + name.charAt(1));
		
		char ch;
		
		System.out.print("\n문자 입력: ");
		ch = sc.next().charAt(0);
		
		System.out.println("ch = " + ch);
		
		sc.close();
	}

}
