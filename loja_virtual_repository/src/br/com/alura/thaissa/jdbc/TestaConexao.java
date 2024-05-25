package br.com.alura.thaissa.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
			
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();
	
		System.out.println("Fechando conexão!");
		con.close();
	}

}