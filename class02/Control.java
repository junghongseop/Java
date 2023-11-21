package class02;

public class Control {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("=== while ===");

        int i = 0;
        while(i<3) {
            System.out.println(2);
            System.out.println(3);
            i++;
        }
        System.out.println("=== for ===");
        for(i = 0; i<3; i++) {
            System.out.println(2);
            System.out.println(3);
        }
        System.out.println(4);
    }
}
