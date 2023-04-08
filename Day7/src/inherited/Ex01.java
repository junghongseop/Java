package inherited;

//상속: 기존의 클래스의 내용을 물려 받아서 새로운 클래스를 작성하는 방법
// - 상속을 해주는 클래스: 상위, 부모, 슈퍼, 기반 클래스라고 함
// - 상속을 바든 클래스: 하위, 자식, 서브, 파생 클래스라고 함

class Super{
	int a = 10;
	
	void superMethod() {
		System.out.println("부모의 메서드 입니다");
	}
}

class Sub extends Super{
	int b = 20;
	
	void subMethod() {
		System.out.println("자식의 메서드 입니다");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("a = " + sup.a);
		sup.superMethod();
		
		//sup.subMethod(); 2.부모는 자식의 멤버를 참조할 수 없음
		
		Sub sub = new Sub();
		
		System.out.println("\na = " + sub.a); 	// 1. 자식은 부모와 자신의 멤버 모두 참조 가능
		System.out.println("b = " + sub.b);
		
		sub.superMethod();
		sub.subMethod();
	}
}
