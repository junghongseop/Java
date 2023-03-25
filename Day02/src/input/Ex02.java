package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		System.out.print("boolean? ");
		bo = scan.nextBoolean();
		
		System.out.println("bo = " + bo);
		
		
		System.out.print("\nbyte? ");
		by = scan.nextByte();
		
		System.out.println("by = " + by);
		
		
		System.out.print("\nshort? ");
		sh = scan.nextShort();
		
		System.out.println("sh = " + sh);
		
		
		System.out.print("\nint? ");
		it = scan.nextInt();
		
		System.out.println("it = " + it);
		
		
		System.out.print("\nlong? ");
		lo = scan.nextLong();
		
		System.out.println("lo = " + lo);
		
		
		System.out.print("\nfloat? ");
		fl = scan.nextFloat();
		
		System.out.println("fl = " + fl);
		
		
		System.out.print("\ndouble? ");
		db = scan.nextDouble();
		
		System.out.println("db = " + db);
		
		scan.close();
		
	}

}
 