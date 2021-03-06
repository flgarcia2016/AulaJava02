package br.com.flaviogarcia;

import java.sql.*;
import java.util.Scanner;

public class calculoSalBanco {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o codigo do funcionario: ");
		int cdFunc = entrada.nextInt();

		System.out.println("Digite a area do funcionario: ");
		String area = entrada.next();

		Connection conexao = ObterConexao();
		Statement statement = conexao.createStatement();

		if (area.equals("TI")) {

			String query = "update teste_java set sal_func = '" + 2000 + "' where cd_func = '" + cdFunc + "'";
			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				System.out.println("Salario do funcionario '" + cdFunc + "' atualizado com sucesso");
			} else {
				System.out.println("Erro ao atualizar o salario do funcionario '" + cdFunc + "'");

			}
		} else {

			String query = "update teste_java set sal_func =  '" + 1200 + "' where cd_func = '" + cdFunc + "'";
			ResultSet resultSet = statement.executeQuery(query);
			
			if (resultSet.next()) {
				System.out.println("Salario do funcionario '" + cdFunc + "' atualizado com sucesso");
			} else {
				System.out.println("Erro ao atualizar o salario do funcionario '" + cdFunc + "'");

			}

		}

		// System.out.println(resultSet.getDate("seal_id"));
		/*
		 * System.out.println(resultSet.getInt("iteg_id"));
		 * System.out.println(resultSet.getString("iteg_id_b2w"));
		 * System.out.println(resultSet.getString("iteg_sku_b2w"));
		 */

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