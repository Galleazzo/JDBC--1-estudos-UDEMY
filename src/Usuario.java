
public class Usuario {

	private int codigo;
	private int idade;
	private String nome;
	
	
	public Usuario(String nome, int idade, int codigo) {
		this.nome = nome;
		this.idade = idade;
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
