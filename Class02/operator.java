package Class02;

public class operator {
    public static void main(String[] args) {
        System.out.println(1>1);    //false
        System.out.println(1==1);   //true
        System.out.println(1<1);
        System.out.println(1>=1);

        //2와 7을 출력해서 false 출력
        System.out.println(2>7);
        System.out.println(2==7);

        //2, 5, 10을 이용해서 true 출력
        System.out.println(2+5<10);
        System.out.println(2*5==10);
        System.out.println((10!=2)||(5==2));
    }
}
