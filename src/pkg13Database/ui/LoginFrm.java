package pkg13Database.ui;

import pkg13Database.service.MembersService;
import pkg13Database.vo.Members;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrm extends BasicFrm implements ActionListener {
    private JTextField tfId;
    private JPasswordField pfPw;

    private JButton btnLogin,btnJoin,btnCancel;
    private JPanel pnlNorth, pnlCenter, pnlSouth;
    private MembersService membersService;

    public LoginFrm() {
        super("로그인", 300, 150);
    }

    @Override
    public void init() {
        tfId = new JTextField(10);
        pfPw = new JPasswordField(10);
        btnLogin = new JButton("Login");
        btnJoin = new JButton("Join");
        btnCancel = new JButton("Cancel");
        pnlNorth = new JPanel();
        pnlSouth = new JPanel();
        pnlCenter = new JPanel();
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        btnJoin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin )
            membersService.login(tfId.getText(), new String(pfPw.getPassword()));
    }

    @Override
    public void arrange() {
        pnlNorth.add(tfId);
        pnlCenter.add(pfPw);
        pnlSouth.add(btnLogin);
        pnlSouth.add(btnJoin);
        pnlSouth.add(btnCancel);
        add(pnlNorth, "North");
        add(pnlCenter, "Center");
        add(pnlSouth, "South");
    }
}
