package inherited;

import other.Person;

class Doctor extends Person{
	private String major;
	
	Doctor(String name, int age, String major){
		super(name, age);
		
		this.major = major;
	}
	
	@Override
	public void showInfo() {
		String result = "%s (%d세, %s)\n";
		
		System.out.printf(result, name, age, major);
	}
	
	void cure(Person per) {
		String result = "%s의 %s(이)가 %s(을)를 치료한다\n";
		
		System.out.printf(result, major, name, per.getName());
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 19, 93);
		Police pol = new Police("김진호", 30, "순걍");
		
		Doctor doc = new Doctor("이진희", 40, "내과");
		
		
		doc.showInfo();
		
		doc.cure(stu);		//의사가 '시림'을 치료하는 메서드
		doc.cure(pol);		// = 업 캐스팅
		
	}
}
