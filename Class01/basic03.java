package Class01;
import javax.swing.JOptionPane;

public class basic03 {
    public static void main(String[] args){

        int n1, n2;
        n1=(int)(Math.random()*8)+2; // 2 ~ 9;
        n2=(int)(Math.random()*9)+1; // 1 ~ 9;

        String sAnswer=JOptionPane.showInputDialog(n1 + "X" + n2 + "=?");
        int ans = Integer.parseInt(sAnswer);
        String m = ans==n1*n2?"정답!":"땡!";
        JOptionPane.showMessageDialog(null, m);

    }
}