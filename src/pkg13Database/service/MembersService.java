package pkg13Database.service;

import pkg13Database.dao.DaoMembers;
import pkg13Database.vo.Members;

import java.lang.reflect.Member;

public class MembersService {
    private DaoMembers daoMembers;
    public void login(String id, String pw) {
        Members members = daoMembers.loginCheck(id, pw);

    }
}
