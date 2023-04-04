package oop;

/*
 *  생서자: 인스천스 생성시 최초 한번만 호출되는 매서트
 *  -클래스 이름과 동일해야 함
 *  =반환형을 작성하지 않음
 *  
 *  기본 생성자
 *  -클래스에 생성자가 하나도 작성되어 있지 않으며 존재하는 생성자
 *  
 */

class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human() {		//기본 생성자는 지적 만들어 줘야 됨
		name = "미정";
		age = -1;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 23);
		Human h2 = new Human();
		
		h1.showInfo();
		h2.showInfo();
	}
}
