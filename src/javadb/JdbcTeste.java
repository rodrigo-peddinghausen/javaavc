package javadb;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {

	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("Conectado ao banco.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

}
