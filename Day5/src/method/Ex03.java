package method;

public class Ex03 {
	
	static void adder(int n1, int n2) {
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		System.out.println("n1 + n3 = " + (n1 + n2) + "\n");
	}
	
	public static void main(String[] args) {
		//매개변수에는 전달인자가 순서대로 채워짐
		adder(5,3);
		
		adder(3,5);
		
		//adder(3);	개수 불일치
		//adder(3.0, 5);	자료형 불이치
	}
}
