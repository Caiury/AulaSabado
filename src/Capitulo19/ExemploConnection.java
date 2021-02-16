package Capitulo19;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ExemploConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection con = null;
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro?useTimezone=true&serverTimezone=America/Sao_Paulo","root","");
			System.out.println("Conectado com sucesso");

		} catch (SQLException e) {

			System.out.println("Ocorreu um erro: " + e.getMessage());
		} finally {
           try {
			con.close();
			System.out.println("Banco fechado com sucesso ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao fechar: "+e.getMessage());
		}
		}
	}

}
