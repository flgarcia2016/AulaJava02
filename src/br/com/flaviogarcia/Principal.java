package br.com.flaviogarcia;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		// inicializa a classe e pega o que o usuario esta inputando no sistema
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu nome: ");
		
		// Para receber o valor
		nome = entrada.nextLine();
		
	    System.out.println("Benvindo de novo " + nome);
	}

}
