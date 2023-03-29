package loop;

import java.util.Scanner;

public class Ex03 {

//반복 종류
//1. 지정 횟수 반복: 반복 횟수가 정해져 있는	반복
//2. 불특정 횟수 반복: 마땅히 반복 횟수가 없는 반복
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		while (n != 0) {
			System.out.print("정수 입력 (0 : 종료) ");
			n =	sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		sc.close();
	}
}
