package Class04;

public class call_by_reference {
    static void replaceSpace(char a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                a[i] = ',';
            }
        }
    }
    public static void main(String[] args) throws Exception {
        char arr[] = {'H', 'e', 'l', 'l', 'o', ' ', 'Y', 'o', 'o', 'n', 's', 'i', 'k'};

        replaceSpace(arr);
        for( char c : arr ) System.out.print(c);

    }
}
