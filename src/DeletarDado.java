import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletarDado {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		
		Statement stmt = connection.createStatement();
		stmt.execute("use java_udemy");
		
		String sql = "delete from usuario where codigo = 1";
		stmt.execute(sql);
		
		
		System.out.println("Deletado !");
		connection.close();
		
	}
	
}
