package collection;

import java.util.ArrayList;

/*
 * collection: 모음
 * framework: 정형화된 개발 도구. 즉, 일정 형채가 정해진 도구
 * 
 * collection framework: 컬레션 프레임워크
 * -자바에서 제공하는 자료구조들을 의미
 * 
 * 자료구조
 * -효율적인 데이터를 처리를 위해서 고안된 구조틀
 * 
 * 
 * collection의 종류)
 * List: 순서o, 중복o
 * Set: 순서x, 중복x
 * Map: key와 value의 한 쌍의 구조
 * 
 * 세가지는 전부 Interface로 작성되어 있고 
 * 이 Interface를 구현한 하위 클래스를 사용
 */

public class Ex01 {
	public static void main(String[] args) {
		//List를 구현한 클래스
		//-ArrayList, LinkedList등
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//<>는 제네릭이라고 해서 모든 타입을 다 받을 수 있음
		//단, 일반 자료형은 사용 불가능하기 때문에 wrapper을 사용
		
		list.add(10);		//add(값): 리스트 가장 뒤에 데이터를 추가
		list.add(5);
		list.add(30);
		
		list.add(10);
		
		System.out.println("list = " + list);
		
		System.out.println("\nlist[1] = " + list.get(1));
		System.out.println("list[2] = " + list.get(2));
		//get(index): 지정 index의 데이터를 반환
		
		
		list.set(1, 50);		//set(index, 값): 지정 index에 데이터를 변경
		System.out.println("\nlist = " + list);
		
		
		list.add(1, 60);		//get(index, 값): 지정 index에 데이터를 추가
		System.out.println("list = " + list);
		
		list.remove(2);			//remove(index): 지정 index의 데이터를 제거
		System.out.println("list = " + list);
		
		//기타 메서드
		System.out.println("\n요소 개수: " + list.size());
		System.out.println("30위치: " + list.indexOf(30));
		
		list.clear();
		
		System.out.println("list = " + list);
	}
}
