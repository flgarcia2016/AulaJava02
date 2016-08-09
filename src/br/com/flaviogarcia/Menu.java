package br.com.flaviogarcia;

import java.util.Scanner;

public class Menu {

	// atributo final nao pode ser alterado
	// Constantes tem que ser declaradas em maiusculo
	public static final int CADASTRO_PRODUTO = 1;
	public static final int EMISSAO_NOTA     = 2;
	public static final int CANCELAR_COMPRA  = 3;
	public static final int EFETUAR_VENDA    = 4;
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu Principal");
		System.out.println("1 - Cadastro de Produtos");
		System.out.println("2 - Emitir Nota Fiscal");
		System.out.println("3 - Cancelar Compra");
		System.out.println("4 - Efetuar Venda");

		System.out.println("Digite a opcao desejada: ");

		int opcao = entrada.nextInt();

		switch (opcao) {
		case CADASTRO_PRODUTO:
			System.out.println("Cadastro de Produtos");
			break;
		case EMISSAO_NOTA:
			System.out.println("Emitir Nota Fiscal");
			break;
		case CANCELAR_COMPRA:
			System.out.println("Cancelar Compra");
			break;
		case EFETUAR_VENDA:
			System.out.println("Efetuar Venda");
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}
}
