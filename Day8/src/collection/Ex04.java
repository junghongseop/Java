package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
//		Set: 순서X, 중복X
//		구현된 클래스 
//		-hashSet, TreeSet
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		set.add(10);	//중복된 데이터는 무시
		
		System.out.println("set = " + set);
		
//		순서가 없다는 의미는 index가 없다는 의미
//		System.out.println("set[0] = " + set.get(0));
		
		set.remove(10);	//index가 아닌 요소로 직접 제거
		
		System.out.println("set = " + set + "\n");
		
//		set은 index가 없어서 일반 for는 사용 불가
		for(int n: set) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			
			System.out.println("n = " + n);
		}
		
	}
}
