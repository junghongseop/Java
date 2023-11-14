package Class11;

public class ex04 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(3/1);
            int num = Integer.parseInt("10A");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 바꿀 수 없습니다");
        }
        catch (Exception e) {               // if문의 else{}와 같은 역할
            System.out.println("숫자는 0으로 나눌 수 없습니다");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
