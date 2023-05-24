package week6;

import java.sql.*;

public class ConnectChecker {

    public void check() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(System.getenv("DB_HOST"),System.getenv("DB_USER"),System.getenv("DB_PW"));

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SHOW DATABASES");
        rs = st.getResultSet();
        while(rs.next()) {
            String str = rs.getString(1);
            System.out.println(str);
        }
    }
    public void add() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(System.getenv("DB_HOST"),System.getenv("DB_USER"),System.getenv("DB_PW"));

        PreparedStatement pstmt = con.prepareStatement("insert into sample(id, name, state) values(?, ?, ?)");
        pstmt.setString(1, "tt");
        pstmt.setString(2, "kyeongrok113");
        pstmt.setString(3, "12345671381");
        pstmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectChecker cc= new ConnectChecker();
        cc.check();
        //cc.add();
    }
}
