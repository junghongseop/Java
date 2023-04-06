package _static;

//클래스의 멤버는 두 가지 형태가 있다
//1. 일반 멤버: 인스턴스 생성시 각자 공간이 할당됨
//2. 정적 멤버: 클래스 자체가 가치는 공간, 인스턴스가 공유

class Person{
	//일반 멤버: 인스턴스 멤버
	String name;
	int age;
	
	//정적 멤버: 클래스 멤버
	static int eyes = 2;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String result = "%s (%d세, %d개)\n";
		
		System.out.printf(result, name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("현재 사람의 눈 개수: " + Person.eyes + "\n");
		// -정적 멤버는 클래스 자체가 가지는 공간
		// - 인스턴스가 없더라도 클래스만 있으먄 바로 사용 가능
		
		Person p1 = new Person("정홍섭", 17);
		Person p2 = new Person("김민수", 22);
		Person p3 = new Person("이경우", 35);
		
		
		Person.eyes = 3; //Person.eyes = 숫가;에서 숫자 자리에 따라 갯수가 바뀜.
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
	}
}
