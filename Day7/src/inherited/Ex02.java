package inherited;

import other.Person;

class Student extends Person{
	private int score;
	
	Student(String name, int age, int score){
		super(name,age);			//super():	부모의 생성자를 호풀
									//- 자식의 생성자는 꼭 부모의 생성자를 호출해야 함
									//- 자식은 부모의 멤버를 가져야 하기 때문에
		this.score = score;
	}
	
	void study(String sub) {
		String result = "%s(이)가 %s(을)를 공부한다\n";
		
		System.out.printf(result, name, sub);
	}
	
	//메서드 오버라이드
	// - 상속 받은 부모의 메서드를 자식에서 '재정의'하는 기법
	@Override
	public void showInfo() {
		String result = "%s (%d세, %d점)\n";
		
		System.out.printf(result, name, age, score);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 23);
		
		per.showInfo();
		per.eat("피자");
		
		System.out.println();
		
		Student stu = new Student("김진호", 17, 87);
		
		stu.showInfo();			//1.재정의 된 메서드
		stu.eat("라면");			//2. 상속 받은 그대로 사용하는 메서드
		stu.study("Java");		//3. 자식에서 추가된 메서드
	}
}
