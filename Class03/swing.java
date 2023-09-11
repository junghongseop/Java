package Class03;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swing extends JFrame {
    public swing() {
        setTitle("Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            JButton jb = new JButton(Integer.toString(i));
            int r = (int) (Math.random() * 256); // Generate random number between 0 and 255 for red component
            int g = (int) (Math.random() * 256); // Generate random number between 0 and 255 for green component
            int b = (int) (Math.random() * 256); // Generate random number between 0 and 255 for blue component
            jb.setBackground(new Color(r, g, b));
            c.add(jb);
        }

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new swing();
    }
}
