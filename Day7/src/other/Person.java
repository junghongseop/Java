package other;

// private		: 내부
// package		: 내부 + 패키지
// protected	: 내부 + 패키지 + 자식
// public		: 내부 + 패키지 + 자식 + 외부

public class Person {
	// protected : 외부 패키지의 자식 클래스에도 접근을 허용
	protected String name;
	protected int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		String result = "%s (%d세)\n";
		
		System.out.printf(result, name, age);
	}
	
	public void eat(String food) {
		String result = "%s(이)가 %s(을)를 먹는다\n";
		
		System.out.printf(result, name, food);
	}
	
	public String getName() {
		return name;
	}
}