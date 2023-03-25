package output;

public class Ex02 {
	public static void main(String[] args) {
		
		//println(): 전달한 데이터를 화면에 출력하고, 마지막에 줄바꿈이 포함되어 있음
		System.out.println("Hello");
		System.out.println("World");
		System.out.println(); //빈 println()은 줄바꿈이 포함되어 있음
		
		//print(): 전달한 데이터를 화면에 출력하고, 줄바굼이 없음
		System.out.print("안녕");
		System.out.print("세상아");
		System.out.println();
		
		//pritnf(): 데이터를 채워서 출력하는 구문, 줄바꿈이 없다
		System.out.printf("이름: %s, %d세", "홍길동", 21);

	}

}
