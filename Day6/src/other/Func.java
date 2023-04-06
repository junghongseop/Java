package other;

public class Func {
	
	private Func() {}
	
	public static int absolute(int n) {
		if (n < 0) {
			n *= -1;
		}
		
		return n;
	}
	
	
	public static double cirlce(double r) {
		return 3.14 * r * r;
	}
	
	public static int total(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	public static int reverse(int n) {
		int rev = 0;
		
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		
		return rev;
		
	}
	
	
	public static boolean isPrime(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		
		if (count == 2) {
			return true;
		}
		
		return false;
	}
	
}
