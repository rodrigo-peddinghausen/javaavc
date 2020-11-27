package javadb;

import java.sql.SQLException;

public class TestaDaoInsere {

	public static void main(String[] args) {
			
		try {
			Contato contato = new Contato();
			contato.setNome("Maria");
			contato.setEmail("maria@gmail.com");
			contato.setEndereco("Avenida Brasil 2222");
			ContatoDAO dao;
			dao = new ContatoDAO();
			dao.adicionar(contato);
			System.out.println("Gravacao feita com sucecsso");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
