package pkg13Database.ui;

import pkg13Database.controller.MainController;
import pkg13Database.vo.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ModifyFrm extends BasicFrm {
    private JTextField tfName, tfMobile, tfEmail;
    private JPasswordField pfPass, pfRePass;
    private JButton btnModify, btnCancel;
    private JLabel[] labels;
    private String[] strings;
    private JPanel pnlNorth, pnlCenter, pnlSouth;
    private MainController mainController;
    private String oldID;


    public ModifyFrm(String title, int width, int height, String oldID) {
        super(title, width, height);
        this.oldID = oldID;

    }


    @Override
    public void init() {
        String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        mainController = MainController.getInstance();
        strings = new String[] {"Password", "RePassword", "Name", "Mobile", "Email"};
        labels = new JLabel[5];
        pnlCenter = new JPanel(new GridLayout(5, 2));
        pnlSouth = new JPanel();
        for (int i = 0; i < strings.length; i++) {
            labels[i] = new JLabel(strings[i]);
        }
        pfPass = new JPasswordField(10); pfRePass = new JPasswordField(10);
        tfName = new JTextField(10); tfMobile = new JTextField(10);
        tfEmail = new JTextField(10);
        btnModify = new JButton("수정 하기"); btnCancel = new JButton("취소");

        btnModify.addActionListener(e -> {
            String mid = oldID;
            String pw1 = new String(pfPass.getPassword());
            String pw2 = new String(pfRePass.getPassword());
            String sname = tfName.getText();String mobile = tfMobile.getText();
            String email = tfEmail.getText();

            //비밀번호와 비밀번호 확인란 비교
            if (!pw1.equals(pw2)) {
                JOptionPane.showMessageDialog(this, "비밀번호가 일치하지 않습니다");
                pfPass.setText("");
                pfRePass.setText("");
                pfPass.requestFocus();
                return;
            }

            //전화번호 유효성 검사
            if (mobile.length() != 11 || !mobile.startsWith("010") || !mobile.matches("\\d+") ) {
                JOptionPane.showMessageDialog(this, "휴대폰 번호를 확인하세요");
                tfMobile.setText("");
                tfMobile.requestFocus();
                return;
            }

            // 이메일 유효성 검사
            if (!email.matches(emailPattern)) {
                JOptionPane.showMessageDialog(this, "유효하지 않은 이메일 주소입니다");
                tfEmail.requestFocus();
                return;
            }

            HashMap<String, Object> map = new HashMap<>();
            map.put("members", new Members(pw1, sname, mobile, email, mid));
            mainController.getControll("Modify", map);
            dispose();
        });

        // 취소 버튼의 동작 추가
        btnCancel.addActionListener(e -> {
            dispose();

        });
    }

    @Override
    public void arrange() {
        pnlCenter.add(labels[0]); pnlCenter.add(pfPass);
        pnlCenter.add(labels[1]); pnlCenter.add(pfRePass);
        pnlCenter.add(labels[2]); pnlCenter.add(tfName);
        pnlCenter.add(labels[3]); pnlCenter.add(tfMobile);
        pnlCenter.add(labels[4]); pnlCenter.add(tfEmail);
        add(pnlCenter, "Center");

        pnlSouth.add(btnModify);   pnlSouth.add(btnCancel);
        add(pnlSouth, "South");
    }
}
