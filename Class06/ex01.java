package Class06;

class A{
    int a, b;
    A(){
        a = 1;
        b = 2;
    }
    A(int a){
        this();
        this.a = a;
    }
    A(int a, int b){
        this.a = a;
        this.b = b;
    }
    void printValue(){
        System.out.println( "a : " + a + ", b :" + b );
    }
}

public class ex01{
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A(3);
        A a3 = new A(3, 5);

        a1.printValue();
        a2.printValue();
        a3.printValue();

    }
}
