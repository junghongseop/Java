package method;

/*
 * 함수: 일정 길이의 코드를 저장하고 재사용하는 방식
 * 메서드: 클래스 안에 작성된 함수를 의미, 객체 지향의 개념에 추가된것
 * 
 */

public class Ex01 {

	//메서드 선언: 실행할 코드가 저장된 곳
	static void hello() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ": Hello World!");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		hello();	//메서드 호출: 선언된 메서드를 사용하는 것
		
		hello();	//메서드 재사용성: 한번 선언한 메서드는 몇번이건 재사용이 가능
		
		hello();
		
		// 메서드 호출 순서
		//1. 메서드가 호출되면 현재 위치(=즐)을 기억하고 해당 메서드로 이용
		//2. 메서드로 이동 후 코드를 순차적으로 수행
		//3. 메서드가 종료되면 1번에서 기억ㅎㄴ 위치로 되돌아서 남은 코드를 이어서 수행
	}
}
