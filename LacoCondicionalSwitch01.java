package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalSwitch01 {

	public static void main(String[] args) {
			
		int codigo;
		float valor, preco, quantidade, total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Código do Produto  	Produto 	       Preço Unitário\n"
				+ " 	1		Cachorro Quente   	  R$ 10,00\n"
				+ "	2		X-Salada		  R$ 15,00\n"
				+ "	3		X-Bacon			  R$ 18,00\n"
				+ "	4		Bauru			  R$ 12,00\n"
				+ "	5		Refrigerante	  	  R$ 8,00\n"
				+ "	6		Suco de Laranja	  	  R$ 13,00\n"
				+ "Insira o código do produto desejado:\n");
		codigo = leia.nextInt();
		System.out.println("Insira o número de unidades desejado: ");
		quantidade = leia.nextFloat();
		
		switch (codigo) {
		case 1:
			preco = 10.0f;
			total = quantidade * preco;
			System.out.printf("Produto: Cachorro Quente x%.0f\n", quantidade);
			System.out.printf("Valor Total: R$ %.2f", total);
			break;
		case 2:
			preco = 15.0f;
			total = quantidade * preco;
			System.out.printf("Produto: X-Salada x%.0f\n", quantidade);
			System.out.printf("Valor Total: R$ %.2f", total);
			break;
		case 3:
			preco = 18.0f;
			total = quantidade * preco;
			System.out.printf("Produto: X-Bacon x%.0f\n", quantidade);
			System.out.printf("Valor Total: R$ %.2f", total);
			break;
		case 4:
			preco = 12.0f;
			total = quantidade * preco;
			System.out.printf("Produto: Bauru x%.0f\n", quantidade);
			System.out.printf("Valor Total: R$ %.2f", total);
			break;
		case 5:
			preco = 18.0f;
			total = quantidade * preco;
			System.out.printf("Produto: Refrigerante x%.0f\n", quantidade);
			System.out.printf("Valor Total: R$ %.2f", total);
			break;
		case 6:
			preco = 13.0f;
			total = quantidade * preco;
			System.out.printf("Produto: Suco de Laranja x%.0f\n", quantidade);
			System.out.printf("Valor Total: R$ %.2f", total);
			break;
		default:
			System.out.println("Inválido");

		}

	}

}
