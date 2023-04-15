package other;

public abstract class Animal {

	//일반 메서드
	public void eat() {
		System.out.println("밥을 먹는다");
	}
	
	//추상 메서드
	//-실행 코드를 가질 수 없는 껍데기 메서드
	//-상속 받은 자식 클래스에서 무조건 오버라이드를 해야함
	public abstract void bark();
}
