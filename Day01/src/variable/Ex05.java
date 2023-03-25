package variable;

/*
   앞선 기본 자료형에서 '문자열'은 없었다
   -문자열은 구조가 많이 다르고 다루기 까다로움
   -자바에서는 문자열 처리를 지원하는 String이라는 클래스가 있고
   -이 String 클래스를 가지고 문자열 처리를 한다
   
    클래스 타입의 자료형은 '참조 자료형'이라고 한다
    -참조는  코딩에서 어떤한 대상을 '가르키는 것'의미하는데,
    
 */
public class Ex05 {
	public static void main(String[] args) {
		String str = "apple";
		
		System.out.println("사과는 " + str);
	}
}
