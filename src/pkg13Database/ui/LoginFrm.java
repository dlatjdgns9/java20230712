package pkg13Database.ui;

import javax.swing.*;

public class LoginFrm extends BasicFrm {
    private JTextField tfId;
    private JPasswordField pfPw;

    private JButton btnLogin,btnJoin,btnCancel;
    private JPanel pnlNorth, pnlCenter, pnlSouth;

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
