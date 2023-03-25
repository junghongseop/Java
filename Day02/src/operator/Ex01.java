package operator;

//연산자: 	데이터를 가공하여 새로운 데이터를 얻는 기호들
//종류: 산술, 대입, 증감, 비교, 논라, 조건 등

public class Ex01 {
	public static void main(String[] args) {
		//산술 연산자: 사칙 연산을 제공
		
		int n1 = 10;
		
		System.out.println("n1 + 5 = " +(n1+5));
		
		System.out.println("n1 = " + n1 + "\n");  //산술 연산은 그 자리에서만 연사하고 변수에 변화를 주지 않음
		
		System.out.println("n1 - 5 = " + (n1 - 5));
		System.out.println("n1 * 2 = " + n1 * 2);
		System.out.println("n1 / 7 = " + n1 / 7);
		System.out.println("n1 % 7 = " + n1 % 7);
		
		
		int birth = 991116;
		
		System.out.println("생년: " + birth / 10000);
		System.out.println("생월: " + birth / 100 % 100);
		System.out.println("생일: " + birth % 100);
	}
}
