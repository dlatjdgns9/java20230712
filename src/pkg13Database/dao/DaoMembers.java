package pkg13Database.dao;

import pkg13Database.vo.Members;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoMembers extends DaoSet {
    public Members loginCheck(String id, String pw) {
        Members members = null;
        try {
            conn = dbConnect();
            String sql = "select * from members where id=? and pass=? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                members = new Members(rs.getLong("mno"), rs.getString("id"), rs.getString("sname")
                        , rs.getString("mobile"), rs.getString("email")
                        , rs.getDate("regdate").toLocalDate(), rs.getDate("birthdate").toLocalDate()
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
        return members;
    }

    public boolean joinRegister(Members members) {
        boolean result = false;
        try {
            conn = dbConnect();
            String sql = "insert into members(id, pass, sname, mobile, email, regdate, birthdate) "
                    + "values(?,?,?,?,?,now(),?) ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, members.getId());
            pstmt.setString(2, members.getPass());
            pstmt.setString(3, members.getSname());
            pstmt.setString(4, members.getMobile());
            pstmt.setString(5, members.getEmail());
            pstmt.setDate(6, Date.valueOf(members.getBirthdate()));
            int count = pstmt.executeUpdate();
            if (count > 0) {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
        return result;
    }

    public boolean duplicateId(Members members) {
        boolean result = false;
        try {
            conn = dbConnect();
            String sql = "select * from members where id=? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, members.getId());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
        return result;
    }

    public ArrayList<Members> getList() {
        ArrayList<Members> result = new ArrayList<>();
        try {
            conn = dbConnect();
            String sql = "select * from members ";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Members m = new Members(rs.getLong("mno"), rs.getString("id")
                        , rs.getString("sname"), rs.getString("mobile"), rs.getString("email")
                        , rs.getDate("regdate").toLocalDate()
                        , rs.getDate("birthdate").toLocalDate()
                );
                result.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
        return result;
    }
}