package Class12;

import java.io.IOException;
import java.io.InputStreamReader;

public class Try_with_Resource {
    public static void main(String[] args) {
        System.out.println("문자를 입력하세요!");

        // System.in 리소스를 해제하면 더이상 콘솔 입력 불가
        // 1. 리소스 자동 해제
        try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
            char input = (char)isr1.read();
            System.out.println("입력 글자 =" + input);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // 2. 리소스 수동 해제
        InputStreamReader isr2 = null;
        try {
            isr2 = new InputStreamReader(System.in);
            char input = (char) isr2.read();
            System.out.println("입력 글자 =" + input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // 리소스 해제 구문
            if (isr2!=null) {
                try {   // 리소스 해제
                    isr2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
