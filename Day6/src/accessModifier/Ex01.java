package accessModifier;

/*
 * 접근 제어 지시자: 클래스의 멤버에 접근하는 정도를 지정
 * private: 클래스 내부에서만 접근 가능
 * package: 내부 + 같은 패키지까지 접근 가능 
 * protected: 내부 + 패키지 + 자식 클래스까지 접근 가능
 * public: 내부 +패키지 + 외부. 즉, 어디선 접근 가능
 * 
 */

import other.Person;

public class Ex01 {
	public static void main(String[] args) {
		Person per = new Person();
		
		per.name = "홍길동";
		//per.age = 26;				package는 외부 패키지에서 접근 불가능 
		//per.height = 170.1;		private는 오직 내부에서만 접근 가능
		
		per.showInfo();
	}
}
