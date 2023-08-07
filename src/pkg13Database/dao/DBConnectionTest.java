package pkg13Database.dao;

import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        DaoSet dao = new DaoSet();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" 드라이버 로딩 오류 : " + e.getMessage());
            e.printStackTrace();
        }

        try {
            dao.dbConnect();
            System.out.println("MariaDB Connection Succeded!");
        } catch (SQLException e) {
            System.out.println("MariaDB Connection Failed!");
            e.printStackTrace();
        } finally {
            dao.closeDB();
        }
        // https://zer0lab.tistory.com/18 참조 사이트
        //1) File > Project Structure > Libraries > java관련 jar file 등록
        //2) mariadb-java-client-3.1.4.jar를 등록하려면 먼저 프로젝트 폴더안으로 복사한다
        //복사 후 마우스 오른쪽 버튼을 눌러서 Add as Library
    }
}