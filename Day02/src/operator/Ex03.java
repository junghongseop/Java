package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 복합 대입 연산자: 산술+대입
		
		int n = 10;
		
		n += 3; //n = n + 3;
		System.out.println("n = " + n);
		
		n -= 5; 
		System.out.println("n = " + n);
		
		n *= 2;
		System.out.println("n = " + n);
		
		n /= 3;
		System.out.println("n = " + n);
		
		n %= 4;
		System.out.println("n = " + n);
		
		int a=5, b=3, c=1;
		
		a += b -= c *= 2;
		
		System.out.println("a =" +a); //6
		System.out.println("b =" +b); //1
		System.out.println("c =" +c); //2
	}
}
