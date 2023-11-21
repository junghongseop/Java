package class01;
import javax.swing.JOptionPane;

public class Practice01 {
    public static void main(String[] args){

        int n1, n2;
        int sumOfCorrectAnswers=0;

        for(int i = 0; i < 2; i++) {
            n1 = (int) (Math.random() * 8) + 2; // 2 ~ 9;
            n2 = (int) (Math.random() * 9) + 1; // 1 ~ 9;

            String sAnswer = JOptionPane.showInputDialog(n1 + "X" + n2 + "=?");
            int ans = Integer.parseInt(sAnswer);

            if (ans == n1 * n2) {
                JOptionPane.showMessageDialog(null, "정답!");
                sumOfCorrectAnswers += ans;
            } else {
                JOptionPane.showMessageDialog(null, "틀렸음 ㅋ");
            }
        }

        JOptionPane.showMessageDialog(null, "정답들의 합은 " + sumOfCorrectAnswers + "입니다!");
    }
}
