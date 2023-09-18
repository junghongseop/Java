package Class04;

class A {
    int m = 3;
    void print(){
        System.out.println("객체 생성 및 횔용");
    }
}

public class _class_basic {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.m = 5;
        System.out.println(a.m);
        a.print();
        b.m = 10;
        System.out.println(b.m);
    }
}
