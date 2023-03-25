package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//Scanner은 버퍼(buffer)를 활용해서 데이터를 읽음
		//
		// 버퍼: 데이터를 임시로 저장하는 공간
		// -데이터 입출력 속도 개선에 영향을 줌
		// -버퍼에선 enter의 space가 데이터 구분의 역할을 함
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.printf("n1 =%d, n2 = %d\n\n", n1, n2);
		
		sc.nextLine(); //엔터만 구분자로 인식, 전체 모두를 가져옴
		
		int n3, n4;
		
		System.out.print("다시 두 정수 입력: ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d, n4 = %d\n", n3, n4);
		
		sc.close();
	}
}
