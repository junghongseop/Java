package operator;

public class Ex06 {
	public static void main(String[] args) {
		//논리 연산자: 참/거짓을 연산
		// - 연산결과는 boolean
		//
		//1. &&: AND, 양쪽 모두 참이면 결과가 참
		System.out.println("true and ture 결과: " + (true && true));
		System.out.println("true and false 결과: " + (true && false));
		System.out.println("false and ture 결과: " + (false && true));
		System.out.println("false and false 결과: " + (false && false));
		System.out.println();
		
		//2.||: OR, 양쪽 모두 거짓이먄 결과가 거짓
		System.out.println("true and ture 결과: " + (true || true));
		System.out.println("true and false 결과: " + (true || false));
		System.out.println("false and ture 결과: " + (false || true));
		System.out.println("false and false 결과: " + (false || false));
		System.out.println();
		
		//3. !: NOT, 참을 거짓으로 거짓을 참으로
		System.out.println("not true 결과: " + !true);
		System.out.println("not false 걀과: " + !false);
	}

}
