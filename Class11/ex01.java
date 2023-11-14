package Class11;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A implements Cloneable{
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ex01 {
    public static void main(String[] args) throws Exception {
        // Checked Exception(일반 예외)

        // 1. InterruptedException
        Thread.sleep(1000);

        // 2. ClassNotFoundException
        Class cls = Class.forName("Java.lang.Object");

        // 3. IOException
        InputStreamReader in = new InputStreamReader(System.in);
        in.read();

        // 4. FileNotFoundException
        FileInputStream fis = new FileInputStream("text.test");

        // 5. CloneNotSupppetedException
        A a1 = new A();
        // A a2 = new (A)a1.clone();
    }
}
