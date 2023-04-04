package method;

/*
 * 메서드의 종류
 * 1. 빈환깂이 없는 메서드: void형 메서드
 * 2. 반환값이 있는 메서드: 자료형 메서드, void가 아닌 모든 메서드
 * 
 * 반환: return
 * -값을 돌려준다는 의미, 메서드의 실행 결과값을 의미
 */

public class Ex04 {
	//void형 메서드: 내부코드를 실행만 함
	static void adder1(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}
	
	//int형 메서드: 코드 실행 후 정수의 결과를 돌려줌
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;		//return: 메서드를 즉시 종료
						// -우측의 값을 호출한 위치로 반환
	}
	
	
	public static void main(String[] args) {
		//void형 메서드는 결과값이 없기 때문에, 그냥 이름만 호출해서 사용
		adder1(5, 6);
		
		//int형 메서드는 정수를 돌려줌
		int n = adder2(5, 6); //1.변수에 결과를 저장하거나
// 		int n = 11;
		
		System.out.println("n = " + n);
		
		//2. 다른 메서드의 전달값의 바로 사용
		System.out.println("adder2(7, 1) = " + adder2(7, 1) + "\n");
		
		//ex)
		int result = adder2(adder2(5, 3), adder2(1, 4));
//		int result = adder2(8, 5);
//		int result = 13;
		
		System.out.println("result = " + result);
	}
}
