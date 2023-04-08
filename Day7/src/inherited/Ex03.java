package inherited;

import other.Person;

class Police extends Person{
	private String rank;
	
	Police(String name, int age, String rank){
		super(name, age);
		this.rank = rank;
	}
	
	void patrol(String area) {
		String result = "%s %s(이)가 %s(을)를 순찰한다\n";
		
		System.out.printf(result, rank, name, area);
	}
	
	@Override
	public void showInfo() {
		String result = "%s (%d세, %s)\n";
		
		System.out.printf(result, name, age, rank);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		//other.Person을 꼭 상속 받아서 작성할 것
		
		Police pol = new Police("홍길동",29,"순경");
		
		pol.showInfo();		//홍길동(29세, 순경)
		pol.eat("팥빵");		//홍길동(이)가 팥빵(을)를 먹는다
		
		pol.patrol("해운대"); //순경 홍길동(이)가 해운대(을)를 순칠
	}
}
