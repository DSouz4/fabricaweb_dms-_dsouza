package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres","novasenha");
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}

}
