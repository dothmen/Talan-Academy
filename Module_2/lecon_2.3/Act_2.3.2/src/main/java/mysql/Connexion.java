package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	private static final String url = "jdbc:mysql://localhost:3306/base_student.sql";
    private static final String driverName = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "";
    private static Connection connection;
    
    public static String getUrl() {
		return url;
	}

	public static String getDrivername() {
		return driverName;
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}

	public static Connection getConnection() throws SQLException {
        try {
            Class.forName(driverName);
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC introuvable.", e);
        }
    }

	public static void setConnection(Connection connection) {
		Connexion.connection = connection;
	}

	
}


