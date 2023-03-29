package loop;

public class Ex05 {
	public static void main(String[] args) {
		//for문: 초기값, 조건식, 증감식이 한곳에 모여 있는 구문
		// -횟수 파악이 용이하기 때문에, 지정 횟수 반복에 자주 사용
		// 또한,뒤에 배울 배열같은 묶음 타입을 반복하기 위해서 고안
		
		for (int i = 1; i <= 5; i++) { //(초기값; 조건식; 증감식)
			
			System.out.println(i + " : Hello World");
		}
		
		
		// for문의 동작 순서
		// 초기값 -> 조건식 -> 종속문장 -> 증감식 -> 조건식 -> 종속문장 -> 증감식..
	}
}
