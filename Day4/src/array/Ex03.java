package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		//배열은 빈 공간을 생성하면, 자동으로 해당 타입의 기본값을 초기화 함.
		boolean[] bos = new boolean[2];
		char[] chs = new char[3];
		int[] its = new int[5];
		double[] dbs = new double[3];
		
		String[] sts = new String[3]; //클래스 타입은 모두 "참조 타입"
		                              //참조 타입 기본값은 null
		
		System.out.println("bos = "+ Arrays.toString(bos));
		System.out.println("char = "+ Arrays.toString(chs));
		System.out.println("its = "+ Arrays.toString(its));
		System.out.println("dbs = "+ Arrays.toString(dbs));
		System.out.println("sts = "+ Arrays.toString(sts));
	}
}
