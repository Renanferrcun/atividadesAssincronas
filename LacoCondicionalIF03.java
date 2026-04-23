package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalIF03 {

	public static void main(String[] args) {
		
		// Variáveis
		String nome;
		int idade;
		Scanner leia = new Scanner(System.in);
		boolean primeira;
		
		// Entrada de dados
		System.out.println("Digite o Nome do doador: ");
		nome = leia.next();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue?");
		primeira = leia.nextBoolean();
		
		// Processamento e Saída de Dados
		if (primeira == true) {
			if (idade >= 18  && idade <= 59) {
			System.out.println(nome + " está apto para doar sangue.");
			}
			else {
			System.out.println(nome + " não está apto a doar sangue.");
			}
		}
		else {
			System.out.println(nome + " está apto para doar sangue.");
		}
	}

}
