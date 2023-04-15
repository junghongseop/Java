package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	private static void timer(int n) throws InputMismatchException, InterruptedException{
		for (int i = n; i >= 1; i--) {
			System.out.println(i +"초");
			
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("몇 초?");
			n = sc.nextInt();
			
			timer(n);
			
		} catch(InputMismatchException | InterruptedException e) {
			//예외 1 | 예외 2
			//-두 타입의 예외를 같이 처리하겠다는 의미
			System.err.println("정수가 아닙니다");
		}
		
		sc.close();
	}
}
