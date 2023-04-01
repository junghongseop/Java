package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = new int[] { 10,20,30,40,50,60,70,80 };
		
		System.out.println("arr[4] = " + arr[4]);
		System.out.println("arr의 크기: " + arr.length + "\n");
		// -java의 배열은 내부에 자체적으로 요소 개수를 저장하고 있음
		
		
		arr [4] = 400;
		
		//배열 전체를 참조하려면 반복을 활용한다
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		
		//배열과 같이 사용하기에 유용한 클래스가 있음
		// -toString(배열 참조 변수) : 전달한 배열의 요소를 문자열로 만들어서 변환
		System.out.println("arr = "+ Arrays.toString(arr));
	}
}
