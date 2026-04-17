package atividadesAssincronas;

import java.util.Scanner;

public class MédiaFinal {

	public static void main(String[] args) {
		
		//Variáveis
		float nota1, nota2, nota3, nota4, mediaFinal;
		Scanner leia = new Scanner(System.in);
		
		
		//Entrada de Dados

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		//Processamento de Dados
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.print("Média final: " + mediaFinal);
	}

}
