package input;

import java.lang.System; // java.lang은 자동으로 import가 된다
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//System: 표준 입출력을 지원하는 클래스
		//out: 출력 객체
		//in : 입력 객체
		
		//in만 가지고는 입력이 좀 번거롭다
		//입력을 조금 수월하게 진행해줄 Scanner라는 클래스를 활용한다
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		// -Scanner 변수는 공간이 없기때문에 new로 공간을 만들어줌
		// -()의 입력값으로도 System.in을 주면 입력 구문을 사용할 수 있게 됨
		
		int n;
		
		System.out.print("정수 입력:");
		n = sc.nextInt(); // next자료형(): 입력한 키값을 해당 타입으로 읽어옴
		
			
		System.out.println("당신의 입력한 값은 " + n +"입니다~");
		
		sc.close(); //사용이 끝난 Scanner는 닫아야 함
	}
}
