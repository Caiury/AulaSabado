package Capitulo19;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class crud {

	private static final String URL = "jdbc:mysql://localhost:3306/cad-alunos?useTimezone=true&serverTimezone=America/Sao_Paulo";
	private static final String LOCAL = "root";
	private static final String PASSWORD = "";
	private static Connection con = null;
	private static Statement operacaoSimples;

	static void inserir() {

		try {
			String query = "INSERT INTO alunos(nome,curso,mensalidade )VALUES('Fulano','ads',450)";
			operacaoSimples = con.createStatement();
			operacaoSimples.execute(query);
			System.out.println("Registro inserido com sucesso!!!");
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro " + e.getMessage());
			e.printStackTrace();
		}

	}

	static void Connection() {
		try {
			con = DriverManager.getConnection(URL, LOCAL, PASSWORD);
			System.out.println("Banco aberto com sucesso!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}

	 static void fecharConnection() {
		try {
			con.close();
			System.out.println("Banco fechado com sucesso!!!");
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crud.Connection();
		crud.inserir();
		crud.fecharConnection();
	}

}
