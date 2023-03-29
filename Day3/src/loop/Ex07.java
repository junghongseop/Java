package loop;

public class Ex07 {
	public static void main(String[] args) {
		//보조 제어문
		
		// break: 제어문을 '즉시' 종료
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
		// continue: 제어문 '즉시' 처음으로
		for (int i =1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
