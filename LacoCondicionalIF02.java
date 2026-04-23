package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalIF02 {

	public static void main(String[] args) {

		// Variaveis
		int numero;
		Scanner leia = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Digite o número A: ");
		numero = leia.nextInt();

		// Processamento e Saida de Dados
		if (numero * -1 < 0) {
			if (numero % 2 == 0) {
				System.out.println("O numero é par e positivo!");
			} else {
				System.out.println("O numero é impar e positivo!");
			}
		} else if (numero * -1 > 0) {
			if (numero % 2 == 0) {
				System.out.println("O numero é par e negativo!");
			} else {
				System.out.println("O numero é impar e negativo!");
			}
		} else {
			System.out.println("O numero é zero!");
		}
	}
}
