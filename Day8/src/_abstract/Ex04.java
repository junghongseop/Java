package _abstract;

import other.USB;

public class Ex04 {
	public static void main(String[] args) {
		//추상 클래스와 인터페이스는 인스턴스 생성이 불가능
		//단, 익명 클래스라는 형태를 사용하면 생성이 가능
		
		//익명 클래스: 클래스 작성 동시에 바로 인스터스를 생성
		//-한개의 인스터스에만 사용가능. 즉, 일회용
		//-인터페이스의 메서드를 구현하려면, 상속 -> 인스턴스 생성 과정을 거침
		// 이를 과정을 생략하기 위해 사용
		USB usb1 = new USB() {
			
			@Override
			public void run() {
				System.out.println("USB1 연결");
			}
		};
		
		
		usb1.run();
		
		
		//함수형 인터페이스는 람다식으로 간략화 가능
		// 힘스형 인터페이스는 메서드를 딱 하나만 가진 인터페이스를 의미
		USB usb2 = () -> {
			System.out.println("USB2 연결");
		};
		
		
		usb2.run();
		System.out.println();
		
		
		
		PC pc = new PC();
		
		pc.connect(usb1);
		pc.connect(usb2);
	}
}
