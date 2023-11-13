package Class10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class cde extends JFrame {
    private JButton btn;

    public cde() {
        this.setTitle("JAVA class");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        btn = new JButton("Action");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Action"))
                    btn.setText("확인");
                else btn.setText("Action");
            }
        });
        jp.add(btn);
        this.add(jp);
        this.setVisible(true);
    }
}

public class Event_handling {
    public static void main(String[] args) {
        new cde();
    }
}
