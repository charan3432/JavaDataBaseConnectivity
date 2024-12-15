// 1. import packages

import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
        import packages                 --> import java.sql.*;
        Load & Register Driver          ---------> This is optional
        Create Connection               --------------->  Connection con = DriverManager.getconnection(url:"jdbc:postgresql://localhost:5432/demo",uname,password);
        Create Statement
        Execute Statement
        process the results
        Close
        */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "root";
//      String sql = "select sname from student where sid=1";
        String sql = "select * from student";



        // 2. Load & Register Driver
//
//        Class.forName("org.postgresql.DriverManager");     // -----> This is optional
//        System.out.println("Driver Loaded.......!");


        // 3. Creating Connection

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established Successfully.........!");

        // 4. Create Statement

        Statement st = con.createStatement();

        // 5. Execute Statement

        ResultSet rs = st.executeQuery(sql);

        // 6. Process the results
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the Student : "+name);

        while(rs.next())
        {
            System.out.print(rs.getInt(1)+" : ");
            System.out.print(rs.getString(2)+" : ");
            System.out.println(rs.getInt(3));
        }

        // 7. Close

        con.close();
        System.out.println("Connection Closed.............!");

    }
}
