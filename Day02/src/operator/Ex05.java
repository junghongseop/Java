package operator;

public class Ex05 {
	public static void main(String[] args) {
		//비교 얀산자: 데이터릐 대소 관계를 비겨하는 연산자
		// -비교 결과는 boolean으로 도출됨
		int n = 10;
		
		System.out.println("n > 10 결과: " + (n > 10));
		System.out.println("n < 20 결과: " + (n < 20));
		System.out.println("n >= 10 결과: " + (n >= 10));
		System.out.println("n <= 20 결과: " + (n <= 20));
		System.out.println("n == 10 결과: " + (n == 10)); // 같으면 참, 다르면 거짓
		System.out.println("n == 20 결과: " + (n == 20)); // 같으면 거짓, 다르면 참
		
		boolean result = (n == 20);
// 		boolean result = false;
		
		System.out.println("\nresult = " + result);
	}
}
