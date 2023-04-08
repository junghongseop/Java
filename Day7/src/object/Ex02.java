package object;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "itbank";
		String str2 = "itbank";
		String str3 = new String("itbank");
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3 + "\n");
		
		
		System.out.println("str1 == str2 결과: " + (str1 == str2));
		System.out.println("str1 == str3 결과: " + (str1 == str2) + "\n");
		
		
		System.out.println("str.equals(str3) 결과: " + str1.equals(str3));
		//String은 이미 제공된 클래스로, Object의 메서드들이 오버라이드 되어있음
		
		// --> 문자열의 내용을 정확하게 비교하고 싶으면, equals()를 사용
	}
}
