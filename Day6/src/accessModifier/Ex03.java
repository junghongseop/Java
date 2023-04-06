package accessModifier;

/*
 * 
 * access 메서드
 * - 외부에서 접근항 수 없는 멤버에 접근을 지원하는 메서드
 * -직접적으로 멤버를 외부에 공개하는 것보다 access 메서드로 간접 접근시 코드에 안정성을 가져옴
 * 
 * 즉, 일단 막고 필여하면 열어주는 개념이라고 필요할때 작성하면 됨
 * 
 * 
 * 작성 방식)
 * get변수명(), set변수명()
 */

class Student {
	private String name;
	private int kor, eng, mat;
	
	void show() {
		String result = "%s (국 %d, 영 %d, 수 %d)\n";
		System.out.printf(result, name, kor, eng, mat);
	}
	
	//setter: 필드의 값을 수정하는 메서드
	void setName(String name) {
		this.name = name;
	}
	
	//getter: 필드이 값을 반환하는 메서드
	String getName() {
		return name;
	}
	
	int getKor() {
		return kor;
	}
	
	void setKor(int kor) {
		this.kor = kor;
	}
	
	int getEng() {
		return eng;
	}
	
	void setEng(int eng) {
		this.eng = eng;
	}
	
	int getMat() {
		return mat;
	}
	
	void setMat(int mat) {
		this.mat = mat;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Student stu = new Student();
		
		//stu.name = "홍길동";
		stu.setName("홍길동");
		stu.setKor(70);
		stu.setEng(80);
		stu.setMat(90);
		
		
		stu.show();
		
		
		//System.out.println("\nstu의 이름:" + stu.name);
		System.out.println("\nstu의 이름: " + stu.getName());
		System.out.println("stu의 국어: " + stu.getKor());
		System.out.println("stu의 영어: " + stu.getEng());
		System.out.println("stu의 수학: " + stu.getMat());
	}
}
