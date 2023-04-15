package other;

/*
 * 자바는 클래스의 다중 상속을 지원하지않음
 * -다중 상속 기능을 많이 물려 받아서 강력한 상속이지만 충돌을 많이 유발해 코드의 안정성을 해친다
 * 
 * 인터페이스
 * -자바에서 다중 상속을 지원하는 형태
 * -추상 클래스보다 더 추상화된 단계
 * -인터페이스도 클래스에 상속을 위해서 사용
 */

public interface FlyAble {
	//필드는 public static final 속성이 적용
	String type = "날개";
	
	//메서드는 public abstract 속성이 적용
	void fly();
}
