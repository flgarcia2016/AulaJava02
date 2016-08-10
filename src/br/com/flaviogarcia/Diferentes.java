package br.com.flaviogarcia;

import java.sql.*;
import java.util.Scanner;

public class Diferentes {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o id Bob: ");
		int idBob = entrada.nextInt();

		Connection conexao = ObterConexao();
		Statement statement = conexao.createStatement();

		String query = "select iteg_id,iteg_id_b2w,iteg_sku_b2w from item_geral where iteg_id = '"+ idBob +"'";
		ResultSet resultSet = statement.executeQuery(query);
		
		if (resultSet.next()) {
			// System.out.println(resultSet.getDate("seal_id"));
			System.out.println(resultSet.getInt("iteg_id"));
			System.out.println(resultSet.getString("iteg_id_b2w"));
			System.out.println(resultSet.getString("iteg_sku_b2w"));
		}
	}

	private static Connection ObterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS = (PROTOCOL = TCP)(HOST = scan-hmlglt1.b2w)(PORT = 1521))(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = BWDEV)))",
					"BOB2", "BOB2");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}

}
