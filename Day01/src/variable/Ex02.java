package variable;

public class Ex02 {
	public static void main(String[] args) {
		//자동 형 변환: 서로 다른 타입을 연산시 발생
		// -사실, 서로 다른 타입은 연산이 불가능
		// -따라서, 서로 타입을 동일하게 맞춰서 연산을 되게 할 수 있음
		//
		// 자동 형변환은 타입이 큰족으로 변화함
		// 정수 ->실수 -> 문자열
		
		System.out.println("10" + "20");
		System.out.println("10" + 20);
		
		System.out.println("당신의 나이는" + 23 + "세 입니다\n");
		
		System.out.println(10 + 3.14);
		
		System.out.println("10 + 3.14 = " + 10 + 3.14 + "\n");
		System.out.println(10 + 3.14 + " = 10 + 3.14");
		
		System.out.println("\n10 + 3.14 =" + (10 + 3.14));
	}
}
