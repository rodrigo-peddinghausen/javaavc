package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsere {

	public static void main(String[] args) {
	
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "INSERT INTO Contatos (nome, email, endereco) values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setNString(1, "Joao");
			stmt.setNString(2, "joao@gmail.com");
			stmt.setNString(3, "Avenida Brasil 2222");
			stmt.execute();
			stmt.close();
			System.out.println("Gravacao feita com sucesso");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
