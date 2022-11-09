import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirUsuario {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		Statement stmt = connection.createStatement();
		
		stmt.execute("use java_udemy");
		stmt.execute("insert into usuario(nome, idade) values ('Julia', '17')");
		
		connection.close();
		
	}

}
