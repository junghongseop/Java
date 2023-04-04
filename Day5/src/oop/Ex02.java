package oop;

class Person {
	//필드: 멤버 변수
	String name;
	int age;
	
	//메서드: 멤버 함수
	void run() {		// =void run(Person this)
		
		System.out.println(this.name + "(이)가 달린다");
		System.out.println(name + "(이)가 달린다\n");
		//멤버 변수를 사용시, 지역 변수와 이름이 겹치지 않으며 this는 생략 가능
	}
	
	void eat(String name) {
		System.out.printf("%s(이)가 %s(을)를 먹는다\n", this.name, name);
		//지역 변수와 이름이 겹치며, 지역 변수가 우선시 됨
		//이때는 멤버 변수 사용시 this를 생략하면 안됨
	}
}

public class Ex02 {
	public static void main(String[] args) {
		//클래스는 새로운 '자료형'이다
		Person per;
		
		per = new Person();		//인스턴스 생성
								//참조 변수에 저장하지 않으며 재사용 불가
		
		per.name = "홍길동";		//멤버에 접근시 참조 변수와 . (dot)을 사용
		per.age = 25;
		
		System.out.println("per의 이름: " + per.name);
		System.out.println("per의 나이: " + per.age + "\n");
		
		
		per.run(); 		//=run(per);
		
		per.eat("라면");	//=eat(per, "라면");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
