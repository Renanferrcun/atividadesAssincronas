package atividadesAssincronas;

import java.util.Scanner;

public class Diferencas {

	public static void main(String[] args) {
		
		// Váriaveis
		float numero1, numero2, numero3, numero4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número; ");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		numero4 = leia.nextFloat();
		
		// Processamento de Dados
		diferenca = (numero1 * numero2) - (numero3 * numero4); 
		
		// Saída de Dados
		System.out.printf("Diferença: %.2f\n", diferenca);
		
		// Processamento de Dados
		diferenca = (numero1 * numero2) - ((numero3 * -1) * numero4); 
		
		// Saída de Dados
			System.out.printf("Diferença: %.2f", diferenca);
		
			
	}

}
