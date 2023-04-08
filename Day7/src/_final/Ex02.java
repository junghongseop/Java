package _final;

class Super{
	

	void superMethod() {
		System.out.println("일반 부모 메서드");
	}

	final void finalMethod() {
		System.out.println("final 부모 메서드");
	}
}

final class Sub extends Super{
	
	@Override 
	void superMethod() {
		System.out.println("재정의한 부모 메서드");
	}
	
	//@Override
	//void finalMethod(){
	//	   System.out.println("재정의 불가능");
	//}
}

// class LowerSub extends Sub{
//			상속 불가능
//}
public class Ex02 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		sup.superMethod();
		sup.finalMethod();
		
		System.out.println();
		
		
		Sub sub = new Sub();
		
		sub.superMethod();
		sub.finalMethod();
	}
}
