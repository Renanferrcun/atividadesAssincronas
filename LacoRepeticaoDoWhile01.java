package atividadesAssincronas;

import java.util.Scanner;

public class LacoRepeticaoDoWhile01 {

	public static void main(String[] args) {
		
		int numero, soma;
		numero = soma = 0;
		
		Scanner leia = new Scanner(System.in);


		do {
			System.out.println("Digite uma idade: ");
			numero = leia.nextInt();
			
			
			if (numero > 0 ) {
				soma += numero;
				
			}
			} while(numero != 0);
		System.out.println("A soma dos números positivos é: " + soma);
	}

}
