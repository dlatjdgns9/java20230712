package pkg13Database.ui;

import pkg13Database.controller.MainController;
import pkg13Database.service.MembersService;
import pkg13Database.vo.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.HashMap;

public class JoinFrm extends BasicFrm {
    private JPanel pnlCenter, pnlSouth;
    private JTextField tfId, tfName, tfMobile, tfEmail, tfBirthday;
    private JPasswordField pfPass, pfRePass;
    private JButton btnJoin, btnCancel;
    private JLabel[] labels;
    private String[] strings;
    private MainController mainController;

    public JoinFrm() {
        super("회원 가입", 250, 300);
    }

    public JoinFrm(Members members) {
        super("회원 가입", 250, 300);
        tfName.setText(members.getSname());
        tfMobile.setText(members.getMobile());
        tfEmail.setText(members.getEmail());
        tfBirthday.setText(members.getBirthdate().toString());
        tfId.requestFocus();
    }

    @Override
    public void init() {
        mainController = MainController.getInstance();
        strings = new String[] {"ID", "Password", "RePassword","Name", "Mobile", "Email", "Birthday"};
        labels = new JLabel[7];
        pnlCenter = new JPanel(new GridLayout(7, 2));
        pnlSouth = new JPanel();
        for (int i = 0; i < strings.length; i++) {
            labels[i] = new JLabel(strings[i]);
        }
        tfId = new JTextField(10);tfName = new JTextField(10);
        tfMobile = new JTextField(10);tfEmail = new JTextField(10);
        tfBirthday = new JTextField(10);tfBirthday.setText("2023-01-01");
        pfPass = new JPasswordField(10);pfRePass = new JPasswordField(10);
        btnJoin = new JButton("회원 가입 하기");btnCancel = new JButton("취소");
        btnJoin.addActionListener(e -> {
            String id = tfId.getText(); String pw1 = new String(pfPass.getPassword());
            String pw2 = new String(pfRePass.getPassword()); String sname = tfName.getText();
            String mobile = tfMobile.getText(); String email = tfEmail.getText();
            String birthday = tfBirthday.getText();
            if(id.equals("")){
                JOptionPane.showMessageDialog(this, "ID를 확인하세요");
                tfId.requestFocus();
                return;
            }
            // 유효성검사를 완성하세요!! 2023-01-01


            LocalDate birth = LocalDate.of(
                    Integer.parseInt(birthday.substring(0,4))
                    , Integer.parseInt(birthday.substring(5,7))
                    , Integer.parseInt(birthday.substring(8)));
            HashMap map = new HashMap();
            map.put("members", new Members(id, pw1, sname, mobile, email, birth));
            dispose();
            mainController.getControll("JoinRegist", map);
        });
        btnCancel.addActionListener(e -> {

        });
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

        pnlSouth.add(btnJoin);   pnlSouth.add(btnCancel);
        add(pnlSouth, "South");
    }
}