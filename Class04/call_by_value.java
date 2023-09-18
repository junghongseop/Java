package Class04;

public class call_by_value {
    static void increase( int a ){
        a++;
    }
    public static void main(String[] args) throws Exception {
        int n = 10;
        increase(n);
        System.out.println(n);
    }
}
