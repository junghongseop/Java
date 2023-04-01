package controlSet;

public class Ex01 {
	public static void main(String[] args) {
		//중첩 반복문: 반복문 안에 또 반복문을 구성하는 방식
		
		for (int i = 1; i <= 3; i++) {	//바깥 for: 행 반복
			
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
