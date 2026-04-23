package atividadesAssincronas;

import java.util.Scanner;

public class LacoRepeticaoDoWhile02 {

	public static void main(String[] args) {
		
		int numero = 0;
		float soma, quantidade, media;
		soma = quantidade = media = 0.0f;
		
		Scanner leia = new Scanner(System.in);


		do {
			System.out.println("Digite uma idade: ");
			numero = leia.nextInt();
					
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				quantidade++;
				media = soma / quantidade;
				
			}
			} while(numero != 0);
		
		String resultado = String.format("%.1f", media).replace(',', '.');
		System.out.println("A média de todos os nuúmeros múltiplos de 3 é: " + resultado);
	}

}
