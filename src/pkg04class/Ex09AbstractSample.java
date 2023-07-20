package pkg04class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09AbstractSample {
    public static void main(String[] args) {
        new Myframe();
    }
}

class Myframe extends JFrame {
    public Myframe() throws HeadlessException {
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        JButton btn = new JButton("확인");

        btn.addActionListener(new ActionListener() { //익명객체
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "welcome gui programing");
            }
        });
        add(btn);
        setVisible(true);
    }
}
