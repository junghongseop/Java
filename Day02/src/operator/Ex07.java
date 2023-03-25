package operator;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//조건 연산자: 참/거짓에 따라서 값을 '선택'하는 연산자
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		String even = (n % 2 == 0)? "짝수" : "홀수";
//		String even = "짝수"; (n = 4인 경우)
//		String even = "홀수"; (n = 5인 경우)
		
		System.out.printf("%d(은)는 %s 입니다\n", n, even);
		
		sc.close();
	}
}
