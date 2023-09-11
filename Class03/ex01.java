package Class03;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String s = s1.next();
        int[] ch = new int [26];

        //반복문을 이용해 문자열 s의 알파벳 빈도를 계산
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                ch[c - 'a']++;
            }
        }
        //반복문을 이용해 빈도가 0이 아닌 알파벳과 개수를 출력
        for (int i = 0; i < 26; i++) {
            if (ch[i] != 0) {
                char alphabet = (char) ('a' + i);
                System.out.println(alphabet + " : " + ch[i]);
            }
        }
    }
}
