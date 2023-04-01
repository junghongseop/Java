package array;

public class Ex05 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4]; //[행][열]
									 // 행:1차원 배열의 개수
									 // 열:그 1차원 배열들의 요소 개수
		
		System.out.println("arr의 크기: "+ arr.length);
		System.out.println("arr[0] 크기: " + arr[0].length + "\n");
		
		arr[2][1] = 7;
		arr[0][2] = 8;
		arr[1][0] = 10;
		arr[0][1] = 123;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);	//%nd: n자리를 미리 확보한 후 데이터를 채움
			}
			System.out.println();
		}
	}

}
