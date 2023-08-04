package pkg13Database.ui;

import javax.swing.*;
import java.awt.*;

public class JoinFrm extends BasicFrm {
    private JPanel pnlCenter, pnlSouth;
    private String[] strings;
    private JLabel[] labels;
    private JTextField tfId, tfName, tfMobile, tfEmail, tfBirthday;
    private JPasswordField pfPass, pfRePass;
    private JButton btnJoin, btnCancel;
    public JoinFrm() {
        super("회원 가입", 250, 300);
    }


    @Override
    public void init() {
        strings = new String[] {"ID", "Password", "RePassword", "Name", "Mobile", "Email", "Birthday"};
        labels = new JLabel[7];

        pnlCenter = new JPanel(new GridLayout(7, 2));
        pnlSouth = new JPanel();
        for (int i = 0; i < strings.length; i++) {
            labels[i] = new JLabel(strings[i]);

        }
        tfId = new JTextField(10); tfName = new JTextField(10);
        tfMobile = new JTextField(10); tfEmail = new JTextField(10);
        tfBirthday = new JTextField(10); tfBirthday.setText("2023-01-01");

        pfPass = new JPasswordField(10);
        pfRePass = new JPasswordField(10);
        btnJoin = new JButton("회원 가입 하기");
        btnCancel = new JButton("취소");
    }

    @Override
    public void arrange() {
        pnlCenter.add(labels[0]); pnlCenter.add(tfId);
        pnlCenter.add(labels[1]); pnlCenter.add(pfPass);
        pnlCenter.add(labels[2]); pnlCenter.add(pfRePass);
        pnlCenter.add(labels[3]); pnlCenter.add(tfName);
        pnlCenter.add(labels[4]); pnlCenter.add(tfMobile);
        pnlCenter.add(labels[5]); pnlCenter.add(tfEmail);
        pnlCenter.add(labels[6]); pnlCenter.add(tfBirthday);
        add(pnlCenter, "Center");

        pnlSouth.add(btnJoin);
        pnlSouth.add(btnCancel);
        add(pnlSouth, "South");
    }
}