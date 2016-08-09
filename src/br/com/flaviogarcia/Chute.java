package br.com.flaviogarcia;

import java.util.Scanner;

public class Chute {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double valorImaginado = (double) 7;
        int contadorChutes = 0;
        
		
		double valorChute;

		do {
			System.out.println("Digite o valor do chute : ");
			valorChute = entrada.nextDouble();
            contadorChutes++;
            
			if (valorChute > valorImaginado) {
				System.out.println("Seu chute foi alto. ");
			} else if(valorChute < valorImaginado) {
				System.out.println("Seu chute foi baixo ");
			}
		} while (valorChute != valorImaginado);
		System.out.println("Parabens seu chute foi certeiro no chute " + contadorChutes);
	}
}
