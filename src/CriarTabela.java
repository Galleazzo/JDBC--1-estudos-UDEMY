import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		
		Statement stmt = connection.createStatement();
		
		stmt.execute("use java_udemy");
		stmt.execute("create table usuario("
				+ "codigo int auto_increment not null, "
				+ "nome varchar(35), "
				+ "idade int(2),"
				+ "primary key(codigo) "
				+ ")");
		
		
		connection.close();
	} 
}
