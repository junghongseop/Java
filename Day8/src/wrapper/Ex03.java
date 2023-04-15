package wrapper;

public class Ex03 {
	public static void main(String[] args) {
		//정수 -> 문자열
		int n1 = 10;
		int n2 = 20;
		
		
		//String str1 = (String)n1;
		
		String str1 = Integer.toString(n1);		//String toString(int i)
		String str2 = Integer.toString(n2);		//- 전달한 정수를 문자열로 변환
		
		System.out.println(str1 + str2);
		
		
		//자동형변환을 사용하면 훨씬 수월
		String str3 = n1 + "";
		
		System.out.println("str3 = " + str3);
	}
}
