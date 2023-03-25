package variable;

/*
 * 자바 자료형         타입          크기
 *-------------------------------------
 *boolean         논리           1bit
 *char            문자           2byte	
 *byte            정수           1byte
 *short           정수           2byte
 *int             정수           4byte
 *long            정수           8byte
 *float           실수           4byte
 *double          실수           8byte
 *
 * bit VS byte
 * 1.bit: 데이터의 최소 단위, 2진수 자리수를 의미
 * - 4bit = 2진수 4자리 = 0000 ~ 1111 = 2^4 = 16자리의 수를 표현할 수 있음
 * 
 * 2.byte:파일의 최소단위
 * - 1byte = 8bit = 2^8 = 256 (0~ 255)
 * 
 *  2의 승수는  10승까지 외운다
 *  승: 0 1 2 3  4  5 6  7   8   9   10      16
 *  값: 1 2 4 8 16 32 64 128 256 512 1024    65536
 */

public class Ex04 {
	public static void main(String[] args) {
		boolean bo = true;
		char ch = 'A';
		byte by =127;
		short sh = 32767;
		int it = 2100000000;
		long lo = 3000000000L; //리터럴: 변수에 저장되지 않고 사용된 데이터를 의미(=의미)
		                       //-리터럴은 상수 풀에 잠시 생성되고 생성될땐 기본타입으로 생성됨
		                       //-정수는 기본 타입이 int, 따라서 30억을 작성하면 에러
		                       //-L은 리터럴 상수 풀에서 long(= 8byte)로 생성해라는 의미가 됨
		
		float fl = 1.2345678912345F; //	F는 상수 풀에서 float(=4byte)로 생성해라는 의미
		double db = 1.2345678912345;
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("it = " + it);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
	}
}
