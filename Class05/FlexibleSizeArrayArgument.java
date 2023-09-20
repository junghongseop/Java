package Class05;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        //method1(int...values)
        method1(1, 2);
        method1(1, 2, 3);
        method1();

        //method2(String...values)
        method2("안녕", "방가");
        method2("땡큐", "베리", "감사");
        method2();
    }
    public static void method1(int...values){
        System.out.println("배열의 길이:" + values.length);

        for (int i : values){
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void method2(String...values){
        System.out.println("배열의 길이:" + values.length);

        for (String j: values){
            System.out.print(j + " ");
        }

        System.out.println();
    }
}
