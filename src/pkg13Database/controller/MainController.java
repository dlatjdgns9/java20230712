package pkg13Database.controller;

import pkg13Database.service.MembersService;
import pkg13Database.ui.JoinFrm;
import pkg13Database.ui.LoginFrm;
import pkg13Database.ui.MainListFrm;
import pkg13Database.vo.Members;

import javax.swing.*;
import java.util.HashMap;

public class MainController {
    private static MainController mainController;

    private MainController() {
    }

    private MembersService membersService = new MembersService();

    private Members session;

    public void setSession(Members session) {
        this.session = session;
    }

    public static MainController getInstance() {
        if (mainController == null) mainController = new MainController();
        return mainController;
    }

    public void getControll(String request, HashMap map) {
        // getControll()요청시 넘겨주는 값이 없을 경우 두번째 인자는 null 입력!
        if (request.equals(""))
            new LoginFrm();
        else if (request.equals("MainList")) {
            new MainListFrm();
        } else if (request.equals("Login")) {
            new LoginFrm();
        } else if (request.equals("LoginCheck")) {
            String id = (String) map.get("id");
            String pw = (String) map.get("pw");
            membersService.login(id, pw);
        } else if(request.equals("LoginResult")){
            Members members = (Members) map.get("members");
            if (members == null) {
                JOptionPane.showMessageDialog(null, "ID와 비밀번호를 확인해주세요");
                mainController.getControll("Login", null);
                return;
            }
            mainController.setSession(members);
            mainController.getControll("MainList", null);
        } else if (request.equals("Join")){
            new JoinFrm();
        } else {
            new LoginFrm();
        }
    }
}