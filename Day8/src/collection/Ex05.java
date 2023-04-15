package collection;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
//		TreeSet: Tree라는 자료구조에 기반한 set
//		-출력시 오름차순 되어서 출력
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(50);
		ts.add(10);
		ts.add(60);
		
		System.out.println("ts = " + ts);

	}
}
