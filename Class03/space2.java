package Class03;

import java.util.Arrays;
import java.util.Scanner;
class space2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        int weight;
        int[] weights = { 2440, 6052, 6378, 3390, 69911, 58232, 25362, 24622 };

        for( String name : names ) System.out.print( name + " " );
        System.out.println();

        System.out.print("행성 이름 입력 : ");
        String name = s.next();

        for( int i=0; i < names.length ; i++  ){
            if( name.equalsIgnoreCase( names[i] ) ) System.out.println( i+1 );
        }
    }
}