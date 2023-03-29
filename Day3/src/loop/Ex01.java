package loop;

public class Ex01 {
	public static void main(String[] args) {
		//반복문 while
		// -조건식이 참이면 종속문장을 수행
		// -종속문이 끝나면 다시 처음으로 돌아옴 (=loop)
		
		int i =1;     //초기값
		
		while (i <= 5) {   //조건식
			System.out.println(i + ": Hello World");
			i++;      //증감식
		}
		
		System.out.println("반복후 i = " + i);
	}
}
