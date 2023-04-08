package _abstract;

/*
	추상 클래스 : 추상적인 개념의 객체를 표현하기 위한 클래스
	ex) 생명, 도형, 감정 등
	
	- 추상적인 개념이라 형태가 없다. 따라서, 인스턴스 생성이 불가능하다
	- 추상 클래스는 내부에 추상 메서드를 가질 수 있다
	- 오로지 상속만을 위한 클래스이다
	
	※ 추상 메서드 : 실행 코드가 없는 껍데기 메서드
	- 상속 받은 자식 클래스가 무조건 오버라이드로 '구현'하게 하는 특징을 가짐
*/

abstract class Figure {
	// 추상 클래스는 일반 메서드를 가질 수 있고
	void show() {
		System.out.println("도형의 일반 메서드 입니다~");
	}
	
	abstract void draw();
}

class Triangle extends Figure {

	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square extends Figure {

	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	
	@Override
	void draw() {
		System.out.println("원을 그린다");
	};
}

public class Ex01 {
	public static void main(String[] args) {
		// Figure fig = new Figure();
		// - 도형은 형태가 불분명하다. 따라서 인스턴스도 생성이 불가능하다 
		
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();

		
		// 업 캐스팅 : 도형들 모여라~~
		Figure[] figs = new Figure[] { tri, squ, cir };
		
		
		// 도형들 그림 그려라~
		// - 서로 다른 그림을 그린다
		// - 이를 '다형성'이라고 한다 (= 다양한 형태를 띄다)
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();
		}
		
		
		// 다형성은 하나의 명령으로 여러 효과를 동시에 내기 위해서 사용한다
		// - 일반 클래스로도 다형성을 구현할 수 있지만
		// - 추상 클래스를 사용하면 다형성을 강제로 구현하게 할 수 있다
		//
		// 다형성 구현의 조건)
		// 1. 상속 관계
		// 2. 오버라이드
		//
		// 여기서 추상클래스는 2번을 강제로 적용하기 때문에
		// 다형성을 반드시 구현해야하는 코드이면 추상 클래스를 사용하게 된다
		
		
	}
}
