package Class05;

class A{
    void print(){
        System.out.println("입력값이 없습니다.");
    }

    void print(int num){
        System.out.printf("정수 입력값 : " + num + "\n");
    }

    void print(double num){
        System.out.printf("실수 입력값 : " + num + "\n");
    }

    void print(String num){
        System.out.printf("문자열 입력값 : " + num + "\n");
    }
}

public class ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.print(3);
        a.print(5.8);
        a.print("안녕");
    }
}
