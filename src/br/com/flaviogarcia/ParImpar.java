package br.com.flaviogarcia;

import java.util.Scanner;

public class ParImpar {
	
   public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   
		System.out.println("Digite o valor: ");
		double valor    = entrada.nextDouble();

		if (valor % 2 == 0 ){
			System.out.println("Seu valor é Par");
		} else {
			System.out.println("Seu valor é impar");
		}
		  
   	 }
}
