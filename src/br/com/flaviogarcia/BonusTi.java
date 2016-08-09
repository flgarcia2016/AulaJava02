package br.com.flaviogarcia;

import java.util.Scanner;

public class BonusTi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double novoSal = (double) 0;
		
		
		System.out.println("Digite o nome do funcionario: ");
		String nome    = entrada.nextLine();

		System.out.println("Digite o salario do funcionario: ");
		double salario = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite a area do funcionario: ");
		String area    = entrada.nextLine();

		if (area.equals("TI")) {
			
		   novoSal =  salario + salario * 0.1;
		} else {
		
			novoSal =  salario;
		}
		
		 System.out.println(nome + "Seu novo salario é " + novoSal);
	}
}
