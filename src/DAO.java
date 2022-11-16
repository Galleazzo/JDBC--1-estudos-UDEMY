import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class DAO {

	private Connection connection;
	
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			
			return -1;
			
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private void adicionarAtributos(PreparedStatement stmt, Object[] atributos)  throws SQLException{
		int indice = 1;
		
		for(Object atributo : atributos) {
			if(atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			}else if(atributo instanceof Integer) {
				stmt.setInt(indice, (Integer) atributo);
			}
		}
	}
	
	private Connection getConexao() {
		try {
			if(connection != null && !connection.isClosed()) {
				return connection;
			}
		}catch (Exception e) {

		}
		
		connection = FabricaConexao.getConnection();
		return connection;
	}
	
	
	
}
