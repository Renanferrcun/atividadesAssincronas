package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalIF01 {

	public static void main(String[] args) {
		
		// Variaveis
		int numA, numB, numC, soma;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Digite o número A: ");
		numA = leia.nextInt();
		System.out.println("Digite o número B: ");
		numB = leia.nextInt();
		System.out.println("Digite o número C: ");
		numC = leia.nextInt();
		
		// Processamento e Saida de Dados
		if (numA + numB > numC) {
			System.out.println("A soma de A + B é Maior do que C.");
		} else if (numA + numB < numC) {
			System.out.println("A soma de A + B é Menor do que C.");
		} else {
			System.out.println("A soma de A + B é Igual a C.");
		}
	}

}
