package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 다중 예외 처리
		// - 예외는 하나가 아니라 복합적으로 발생할 수 있다
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		int[] arr = new int[] { 10,20,30,40,50,60,70,80,90,100 };
		
		try {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
			
			System.out.println("10 / n = " + 10 / n);
			
			System.out.printf("arr[%d] = %d\n", n, arr[n]);
			
		} catch(InputMismatchException e) {
			System.err.println("정수가 아닙니다!!!");
			
		} catch(ArithmeticException e) {
			// e는 참조변수로 예외 객체를 가리키고 있다
			// - 예외 객체에는 다양한 예외에 관한 정보가 담겨있다
			
			System.err.println("예외 메세지 : " + e.getMessage());
			
		} catch(Exception e) {
			// Exception은 예외의 최상위 클래스
			// - 모든 예외 클래스는 이 클래스를 상속 받고 있음
			// - 즉, Exception은 모드 예외를 받아서 처리 가능
			
			e.printStackTrace();	// 예외의 발생 위치를 추적
			
			return;
			
		} finally {	
			// finally : 얘외 여부에 상관없이 '무조건' 실행되는 구문
			// - 메서드가 종료가 되어도 실행된다
			// - 주로 할당 받은 자원을 해제하는 용도로 사용
		
			System.out.println("스캐너 종료");
			sc.close();
		}
		
	}
}
