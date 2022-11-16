import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricaConexao {

	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306";
			String usuario = "root";
			String senha = "";
		
			
			return DriverManager.getConnection(url, usuario, senha);
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
