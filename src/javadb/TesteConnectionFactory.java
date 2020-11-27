package javadb;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConnectionFactory {

	public static void main(String[] args) {
		Connection con;
		try {
			con = ConnectionFactory.getConnection();
			System.out.println("Conectado");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
