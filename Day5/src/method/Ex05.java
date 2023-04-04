package method;

/*
 * 	메서드 오버로딩 
 * 	- 같은 이름의 메서드를 여러개를 작성하는 방식
 * 
 * 	작성 규칙)
 * 	1. 메서드들의 이름이 같아야 함
 * 	2. 매개변수의 형태가 달라야 함
 * 	3. 반환형은 오버로딩에 무관
 * 
 */

public class Ex05 {
	static int adder(int n1, int n2) {
		return n1 + n2;
	}

	static int adder(int n) {
		return 100 + n;
	}
	
	static double adder(double n) {
		return 3.14 + n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("결과: " + adder(5,6));
		
		System.out.println("결과: " + adder(5));
		
		System.out.println("결과: " + adder(5.0));
	}
}
