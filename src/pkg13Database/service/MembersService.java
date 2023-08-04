package pkg13Database.service;

import pkg13Database.controller.MainController;
import pkg13Database.dao.DaoMembers;
import pkg13Database.vo.Members;

import java.util.HashMap;

public class MembersService {
    private DaoMembers daoMembers = new DaoMembers();

    public void login(String id, String pw) {
        Members members = daoMembers.loginCheck(id, pw);
        HashMap map = new HashMap();
        map.put("members", members);
        MainController.getInstance().getControll("LoginResult", map);
    }
}