import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kucingscript
 */
public class Koneksi {

    public static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/finalsd"; 
        String user = "root";
        String password = "kucingmenangis";
        
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return connection;
    }
}
