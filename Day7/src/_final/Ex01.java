package _final;

//final: 마지막의
// 변수에 사용: 변수를 상수화
// 메서드에 사용: 오버라이딩을 막음
// 클래스에 사용: 상속을 막음

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		final int fn = 20;
		
		System.out.printf("n = %d, fn = %d\n", n, fn);
		
		n = 100;
		//fn = 200;
		
		System.out.printf("n = %d, fn = %d\n", n, fn);
		
		
		//데이터를 변경하는 연산은 모두 불가능
		//fn++;
		//fn += 10;
		
		System.out.println("fn + 5 = " + (fn + 5));
		System.out.println("fn > 5 결과: " + (fn > 5));
	}
}
