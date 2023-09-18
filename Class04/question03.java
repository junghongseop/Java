package Class04;

import java.util.Random;

public class question03 {
    public static int[] shuffle(int[] arr){
        Random rand = new Random();
        for (int i= arr.length - 1; i>0; i--) {
            int j = rand.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println( java.util.Arrays.toString(original) );
        System.out.println( java.util.Arrays.toString(result) );
    }
}
