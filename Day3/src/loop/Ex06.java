package loop;

public class Ex06 {
	public static void main(String[] args) {
		//지역변수 (local variable)
		// -특정 영역안에서 생성된 변수
		// -해당 영역에서 생성되며, 해당 영역이 끝나면 사라짐
			 
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(i + " : Hello World");
		}
		System.out.println();
		
		// System.out.println("반복 후 i = " + i);
		// -for문애서 생성된 i는 그 영역이 끝나면 메모리에서 제거
		
		int i;
		
		for (i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello world");
		}
		
		System.out.println("반복 후 i = " + i);
	}
}
