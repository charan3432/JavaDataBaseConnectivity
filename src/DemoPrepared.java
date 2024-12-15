import java.sql.*;

public class DemoPrepared {
    public static void main(String[] args) throws Exception {
        int id = 101;
        String name = "Saddam";
        int marks = 78;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "root";
        String sql = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Established sucessfully.....................!");

        PreparedStatement st = con.prepareStatement(sql);

        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,marks);


        st.execute();

        con.close();
        System.out.println("Connection closed...................!");
    }
}
