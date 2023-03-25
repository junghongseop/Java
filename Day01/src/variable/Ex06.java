package variable;

public class Ex06 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 36;
		double height = 177.3;
		char gender = '남';
		boolean isArmy = true;
		
		System.out.println("이름: " + name + " (" + age + "세, " + gender + ")");
		System.out.println("신장: " + height + "cm");
		System.out.println("군필: " + isArmy + "\n");
		
		System.out.printf("이름: %s (%d세, %c)\n", name, age, gender);
		System.out.printf("신장: %f cm\n", height);
		System.out.printf("신장: %.1f cm\n", height);
		System.out.printf("군필: %b", isArmy);
		
		/*
		 * %s: String, 문자열 정리
		 * %ㅇ: Decimal, 10진 정수 자리
		 * %c: Character, 문자 자리
		 * %f: Float, 실수 자리
		 * %b: Boolean, 논리 자리
		 * 
		 * 문서를 '서식 문자(=포맷 문자)'라고 함
		 * 문자열에서 형태(=format)만 잡아 놓고, 뒤에서 데이터를 채운 방식
		 * 서식문자에는 데이터가 순서대로 채워진다
		 * 
		 */
	}
}
