import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConsultarUsuario1 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		
		String sql = "select * from usuario";
		
		Statement stmt = connection.createStatement();
		stmt.execute("use java_udemy");      
		ResultSet resultset = stmt.executeQuery(sql);
		
		ArrayList<Usuario> users = new ArrayList<>();
		
		while(resultset.next()) {
			String nome = resultset.getString("nome");
			int cod = resultset.getInt("codigo");
			int idade = resultset.getInt("idade");
			
			users.add(new Usuario(nome, idade,cod));
		}
		
		users.forEach(u ->{
			System.out.println("ID: "+u.getCodigo()+"	Nome: "+u.getNome()+"	Idade: "+u.getIdade());
		});
		
		connection.close();
	}
	
}
