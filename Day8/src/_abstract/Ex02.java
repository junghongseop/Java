package _abstract;

import other.Animal;
import other.FlyAble;

/*
 * 클래스의 상속은 기존의 기능을 물려 받아서 기능을 더 추가한 클래스를 만들기 위함
 * 따라서, 기능을 확장하기 때문에 extends로 상속
 * 
 * 인터페이스의 상속은 아무덕도 없는 껍데기를 상속 받고
 * 이름, 자식 클래스에서 직접 오버라이드해서 구현
 * 즉, 특정 메서드를 해당 클래스에 구현하기 위해서 사용
 * 따라서, 특정 기능을 구현하게 하기 때문에 implements로 상속
 */

class Bird extends Animal implements FlyAble{
	
	@Override
	public void bark() {
		System.out.println("짹짹");
	}
	
	@Override
	public void fly() {
		System.out.println(type + "로 날아간다");
	}
}

class Airplain implements FlyAble{
	@Override
	public void fly() {
		System.out.println("엔진으로 날아간다");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bir = new Bird();
		
		Airplain air = new Airplain();
		
		//동물들 모여라
		//-동물이 아닌 비행기는 낄수 없음
		Animal[] anis = new Animal[] { dog, cat, bir };
		
		for(int i =  0; i < anis.length; i++) {
			anis[i].bark();
			//anis[i].f;y();
		}
		System.out.println();
		
		//날수 있는 친구들 모여라
		//-날수 없는 강아지와 고양이는 낄 수 없음
		FlyAble[] flys = new FlyAble[] { bir, air };
		
		for(int i = 0; i < flys.length; i++) {
			//flys[i].bark();
			flys[i].fly();
		}
		
		
	}
}
