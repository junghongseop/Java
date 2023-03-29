package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
	// 무한 반복을 활용한 불특정 횟수 반복
	Scanner sc = new Scanner(System.in);
	int n;
	
	while (true) {
		System.out.print("정수 입력(0:종료) ");
		n = sc.nextInt();
		
		if(n == 0) {
			break; //제어문을 '즉시' 탈출
			       //if에는 걸리지 않고 조건을 주기 위함
		}
		
		System.out.println("n = " + n + "\n");
		}
		sc.close();
	
	}
}
