package pkg13Database.dao;

import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        DaoSet dao = new DaoSet();
        try {
            dao.dbConnect();
            System.out.println("MariaDB Connection Succeded!");
        } catch (SQLException e) {
            System.out.println("MariaDB Connection Failed!");
            throw new RuntimeException(e);
        }finally {
            dao.closeDB();
        }

        //File -> Project Structure -> Libraries -> java 관련 jar file등록
        //mariadb-java-client 3.1.4.jar를 등록하려면 먼저 프로젝트 폴더안으로 복사한다.
        //복사 후 마우스 오른쪽 버튼 눌러서 add library
    }
}
