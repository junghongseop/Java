package Class02;

public class referenceType {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";

        System.out.println(users[1]);
        System.out.println(users.length);

        int[] scores = new int[]{10, 100, 100};
        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}
