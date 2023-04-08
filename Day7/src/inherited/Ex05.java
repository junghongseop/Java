package inherited;

import other.Person;

public class Ex05 {
	public static void main(String[] args) {
		//업캐스팅은 하위 클래스를 묶어서 처리하기 위함
		Student stu = new Student("홍길동", 19, 92);
		Police pol = new Police("김진호", 30, "순경");
		
		//학생들 모여라
		//-경찰은 낄 수 없다
		//Student[] stus = new Student[] { stu, pol };
		
		//경찰들 모여라
		//-학생은 낄수 없다
		//Police[] pols = new Police[] { stu, pol };
		
		//사람들 모여라
		//-경찰, 학생 둘 다 낄 수 있다 (= 업 캐스팅)
		Person[] pers = new Person[] { stu, pol };
		
		pers[0].showInfo();		//업 캐스팅시, 부모와 멤버는 참조 가능
		pers[1].showInfo();
		
		//pers[1].patrol("서면");       단, 자식의 멤버는 참조가 불가능
		
		System.out.println();
		
		//사람 무리들에서 경찰을 꺼내서 경찰의 기능을 수행
		// 이때, 업 캐스팅된 객체를 다시 원래 타입으로 변환하는 것을 'down-casting'이라고 함
		Police tmp = (Police) pers[1];
		
		tmp.showInfo();
		tmp.patrol("서면");
		
		System.out.println();
		
		//한줄로 바로 적용하는 방법
		((Student) pers[0]).study("Java");
	}
}
