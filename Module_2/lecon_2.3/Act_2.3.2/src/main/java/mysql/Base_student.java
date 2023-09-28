package mysql;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Base_student {

	public static void main(String[] args) {
		Connection con = null;
        java.sql.Statement st = null;
        ResultSet res = null;

        try {
           
            String url = "jdbc:mysql://localhost:3306/base_student.sql?characterEncoding=UTF-8";
           
            con = DriverManager.getConnection(url, "root", "");

            st = con.createStatement();
            res = st.executeQuery("select * from film");

            while (res.next()) {
                System.out.println("titre : " + res.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null) res.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}