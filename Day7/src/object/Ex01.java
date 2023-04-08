package object;

import java.lang.Object;

//Object 클래스: 자바의 최상위 클래스
//-자바에서 생성된 모든 클래스는 이 Object를 상속 받게 되어있음 (예외 없음)
//즉, 어떠한 클래스든 Object로 업캐스팅이 가능하다는 의미

class Po extends Object{		//Object는 자동을 상속되기 떄문에 생략 가능
	private int x, y;
	
	Po(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//toString()을 오버라이드 하면 내가 원하는대로 참조변수를 참조할수 있음
	@Override
	public String toString() {
		return "(" + x +", " + y+ ")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(getClass() != obj.getClass())
			return false;
		
		Po other =(Po) obj;
		
		if(x != other.x)
			return false;
		
		if(y != other.y)
			return false;
		
		return true;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Po p1 = new Po(5, 3);
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString());
		//참조 변수를 출력에 사용하면, Object의 toString()이 호출되게 되어 있음
		
		Po p2 = new Po(5, 3);
		Po p3 = p1;
		
		System.out.printf("\np2 = %s, p3 = %s\n\n", p2, p3);
		
		//참조 변수의 비교연산은 '같은 대상을 가리키는지'를 비교
		// 즉, 참조 변수의 비교는 실제 데이터를 비교하는 것이 아니라는 의미
		System.out.println("p1 == p2 결과: " + (p1 == p2));
		System.out.println("p1 == p3 결괴: " + (p1 ==p3) + "\n");
		
		//equals()를 Object에서 상속 받은 그대로 사용하면, ==연산과 동일함
		//즉, 오버라이딩을 해서 원하는 결과를 만들어야 함
		System.out.println("p1.eqyals(p2) 결과: " + p1.equals(p2));
	}
}
