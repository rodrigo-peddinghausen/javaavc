package bibliotecas;

public class Cliente2 {
	String nome;
	String endereco;
	
	public Cliente2(String nome) {
		this.nome=nome;
	}
	
	public Cliente2() {
		
	}
	
	public String toString() {
		return "Nome do Cliente: " + this.nome;
	}
}
