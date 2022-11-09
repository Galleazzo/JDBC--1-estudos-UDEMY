import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AtualizarDado {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		
		Statement stmt = connection.createStatement();
		String sql = "update usuario set nome = 'Sandra' where codigo = '4'";
		
		stmt.execute("use java_udemy");
		stmt.execute(sql);
		
		
		System.out.println("Atualizado !");
		connection.close();
		
	}

}
