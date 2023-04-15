package exception;

/*
 * 오류: 프로그램 상의 오작동을 의미
 * 1. 에러: 시스템 레벨의 오류. 개발자가 처리 가능
 * 2. 예와: 논리 레벨의 오류. 개밯자가 사후 혹은 예측 후 처리 가능
 * 
 * 이러한 예외를 처리하는 것을 '예외 처리'라고 함
 * 
 * 예외 처리를 알아야 하는 이유
 * 1. 예외를 잡아서 프로그램의 흐름을 올바르게 제어 가능
 * 2. 예외를 처리하지 않으면 사용 불가한 메서드들이 있음
 * 
 * 개발자가 예외를 처리하지 않으면 JVM이 잡아서 처리
 * -JVM이 예외를 잡게 되면 그 순간 프로그램이 종료
 */

public class Ex01 {
	public static void main(String[] args) {
		
		try {	//try: 예외를 검사하는 영역. 발생한 예외는 catch로 보냄
			System.out.println(10 / 0);
			
		} catch(ArithmeticException e) {	//catch: 예외 발생시 실행되는 구문
											//-예외 타입이 다르면 실행이 안됨
			System.out.println("예외 발생~");
			//-err은 표준 에러 출력 객체
		}
		
		System.out.println("여기 출력 되나요?");
	}
}
