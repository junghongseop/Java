package wrapper;

/*
 * wrap:둘러싸다
 * wrapper클래스: 일반 자료형을 객체 취급하기 위해서 고안된 클래스
 * 
 * 일반 자료형         wrapper
 * --------------------------
 * boolean			Boolean
 * char				Character
 * byte				Byte
 * short			Short
 * int				Interger
 * long 			Long
 * float			Float
 * double			Double
 * 
 * 
 * 사용처
 * 1. 문자열과 형변환시 사용
 * 2. 일반 자료형을 사용할 수 없는 경우
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = 20;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2 + "\n");
		//Integer는 클래스이고 메서드 같은 멤버가 많다
		//즉, Integer가 더 무겁다는 의미
		//따라서, Integer 같은 wrapper를 따히 쓸 필요가 없으면 일반 자료형이 성능상 유리
		
		System.out.println("2진수: " + Integer.toBinaryString(10));
		System.out.println("8진수: " + Integer.toOctalString(10));
		System.out.println("16진수: " + Integer.toHexString(10));
	}
}
