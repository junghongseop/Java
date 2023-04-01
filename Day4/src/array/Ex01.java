package array;

//변수: 데이터를 저장하는 공간
//베열: '같은 자료형'으로 '메모리상 연속'된 공간

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		
		int[] arr = new int[] { 10,20,30,40,50};
		//                      0  1  3  4  5(=index, 순서 번호)
		
		System.out.println("n = " + n);
		System.out.println("arr = " + arr + "\n");
		//배열은 일반 자료형 타입이 아니고, '참조 자료형'이라고 함
		//참조란, 어떠한 대상을 가르키는 것을 의미
		//참조 타입을 출력해 사용하면, '해시코드'가 출력
		//해시코드는 메모리 주소는 아니고, 데이터의 ID값 정도로 생각하면 됨
		
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[4] = " + arr[4]);
		// -배열에 저장된 데이터를 요소(=elements)라고 함
		// -요소에 접근하려면 참조뱐스와 index가 필요
		
		// System.out.println("arr[5] = " + arr[5]);
		// -범위를 초과한 참조는 에러
	}
}
