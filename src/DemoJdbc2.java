import java.sql.*;

public class DemoJdbc2 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "root";
        String sql = "delete from student where sid=7";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection is Succesfull..............!");

        Statement st = con.createStatement();

        st.execute(sql);

        con.close();
        System.out.println("Connectin Closed..............!");



    }
}
