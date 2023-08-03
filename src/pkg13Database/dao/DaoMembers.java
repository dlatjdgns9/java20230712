package pkg13Database.dao;

import pkg13Database.vo.Members;

import java.sql.SQLException;

public class DaoMembers extends DaoSet{
    public Members loginCheck(String id, String pw) {
        Members members =null;
        try {
            conn = dbConnect();
            String sql = "select * from members where id=? and pass=? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                members = new Members(rs.getLong("mno"), rs.getString("id"), rs.getString("name")
                , rs.getString("mobile"), rs.getString("email"), rs.getDate("regDate").toLocalDate(), rs.getDate("birthDate").toLocalDate());
            }
        } catch (SQLException e) {e.printStackTrace(); }
        finally {
            closeDB();
        }

     return members;
    }
}
