package _abstract;

import other.Animal;

//추상 클래스는 상속을 위해서 사용
class Cat extends Animal{
	
	@Override
	public void bark() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.bark();
		cat.eat();
		
		System.out.println();
		
		
		Dog dog = new Dog();
		
		dog.bark();
		dog.eat();
		
		
		//추상 클래스는 인스턴스를 만들지는 못함
		//단, 참조변수는 사용가능. 업캐스팅 하기 위함
		Animal[] anis = new Animal[] { dog, cat };
		
		for(int i = 0; i < anis.length; i++) {
			anis[i].bark();
		}
	}
}
