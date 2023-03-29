package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int i = 1, dan;
		
		System.out.print("몇 단? ");
		dan = sc.nextInt();
		
		while (i <= 9) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			i++;
		}
		System.out.println();
		
		i=9;
		
		while (i >= 1) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			i--;
		}
		sc.close();
	}
}
