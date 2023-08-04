package pkg13Database.ui;

import pkg13Database.controller.MainController;
import pkg13Database.service.MembersService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginFrm extends BasicFrm implements ActionListener {
    private JTextField tfId;
    private JPasswordField pfPass;
    private JButton btnLogin, btnJoin, btnCancel;
    private JPanel pnlNorth, pnlCenter, pnlSouth;
    private MainController mc = MainController.getInstance();

    public LoginFrm() {
        super("로그인", 250, 150);
    }

    @Override
    public void init() {
        tfId = new JTextField(10);
        pfPass = new JPasswordField(10);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            HashMap map = new HashMap();
            map.put("id", tfId.getText());
            map.put("pw",new String(pfPass.getPassword()));
            mc.getControll("LoginCheck", map);
            dispose();
        } else if (e.getSource() == btnJoin) {
            mc.getControll("Join", null);
        }
    }

    @Override
    public void arrange() {
        pnlNorth.add(tfId);
        pnlCenter.add(pfPass);
        pnlSouth.add(btnLogin);
        pnlSouth.add(btnJoin);
        pnlSouth.add(btnCancel);
        add(pnlNorth, "North");
        add(pnlCenter, "Center");
        add(pnlSouth, "South");
    }
}