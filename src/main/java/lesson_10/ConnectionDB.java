package lesson_10;
import java.sql.*;

public class ConnectionDB {
    Pojo pojo;

    public ConnectionDB(Pojo pojo) {
        this.pojo = pojo;
    }

    public ConnectionDB(){

    }

    Connection conn = null;
    public void connection(){
        Connection conn = null;

       try
        {
            String userName = "nikita";
            String password = "111";
            String url = "jdbc:mysql://127.0.0.1/DioStudy";
            Class.forName("com.mysql.jdbc.Driver").newInstance ();

            this.conn = DriverManager.getConnection(url, userName, password);
            System.out.println ("Database connection established");

            if(pojo != null) {
                insert();
            }
        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
            e.printStackTrace();
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { }
            }
        }

    }

    public void insert(){
        String query = " insert into client (name, phone, pc, salary)"
                + " values (?, ?, ?, ?)";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, this.pojo.getClient());
            preparedStmt.setString (2, this.pojo.getPhone());
            preparedStmt.setString(3, this.pojo.getPc());
            preparedStmt.setString (4, this.pojo.getSalary());
            preparedStmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }  finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { }
            }
        }

        // execute the preparedstatement

    }



}
