package pkg13Database.service;

import pkg13Database.controller.MainController;
import pkg13Database.dao.DaoMembers;
import pkg13Database.vo.Members;

import java.util.ArrayList;
import java.util.HashMap;

public class MembersService {
    private DaoMembers daoMembers = new DaoMembers();

    public void loginCheck(String id, String pw) {
        Members members = daoMembers.loginCheck(id, pw);
        HashMap map = new HashMap();
        map.put("members", members);
        MainController.getInstance().getControll("LoginResult", map);
    }

    public boolean joinRegist(Members members) {
        boolean result = false;
        if (daoMembers.duplicateId(members)) {
            result = true;
        } else {
            daoMembers.joinRegister(members);
        }
        return result;
    }

    public ArrayList<Members> getList() {
        ArrayList<Members> result = null;
        result = daoMembers.getList();
        return result;
    }
}