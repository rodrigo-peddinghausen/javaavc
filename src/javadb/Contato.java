package javadb;
/*
 * JAVA BEANS = POJO (PLAIN OLD JAVA OBJECTS)
 * As tabelas do banco, na camada de programação viram classes JavaBeans.
 * As colunas ou campos do banco, na camada de programação viram os atributos da classe, 
 * com as respectivas equivalências de tipos.
 */

public class Contato {
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
