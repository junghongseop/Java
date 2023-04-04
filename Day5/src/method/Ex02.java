package method;

public class Ex02 {
	// 매개 변수
	// -메서드 호출시 전달된 값을 저장하는 변수
	// -외부로 부터 값을 받아야하며, 직접 초기화 하면 에러
	static void hello(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "Hello World!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		hello(3);	//전달인자: 메서드 호출시 전달하는 값
		
		hello(1);
		
		hello(6);
		
		//잘못된 사용 방식
		//hello();	전달인자 부족
		//hello(3,4);	매개번수 부족
		//hello(3.0);	자료형 불일치
		//
		//정리)전달인지와 매개 변수는 개수및 자료형을 일치 시킴
	}
}
