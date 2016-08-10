package br.com.flaviogarcia;

import java.sql.*;
import java.util.Scanner;

public class calcUseCallPack {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o codigo do funcionario: ");
		int cdFunc = entrada.nextInt();

		System.out.println("Digite a area do funcionario: ");
		String area = entrada.next();

		Connection conexao = ObterConexao();
		Statement statement = conexao.createStatement();

		if (area.equals("TI")) {
			CallableStatement cs3 = conexao
					.prepareCall("begin pr_atualiza_sal ('" + cdFunc + "','" + area + "'); end;"); // stored
																									// proc
		}
		System.out.println("Salario atualizado com sucesso.");
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