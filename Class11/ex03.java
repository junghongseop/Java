package Class11;

public class ex03 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(3/0);
        } catch (Exception e) {         // ArithmeticException 과 Exception을 바꿔도 차이가 없음
            System.out.println("숫자는 0으로 나눌 수 없습니다");
        } finally {
            System.out.println("종료");
        }
    }
}
