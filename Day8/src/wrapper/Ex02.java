package wrapper;

public class Exe02 {
	public static void main(String[] args) {
		//문자열 -> 정수
		String str1 = "10";
		String str2 = "20";
		
		System.out.println(str1 + str2);
		
		//int n1 = (int)str1;
		//-일반 타입과 클래스는 형변환이 불가능
		
		int n1 = Integer.parseInt(str1);	//int parseInt(String s)
		int n2 = Integer.parseInt(str2);	//- 전달한 문자열을 정수로 변환
		
		
		System.out.println(n1 + n2);
		
		double n3 = Double.parseDouble("3.141592");
		System.out.println(n3 + 10.5);
	}
}
