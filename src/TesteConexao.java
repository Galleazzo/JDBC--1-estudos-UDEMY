import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		
		Statement stmt = connection.createStatement();
		
		stmt.execute("create database java_udemy");
		
		connection.close();	
	}
	
}
