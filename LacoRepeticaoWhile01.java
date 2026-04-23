package atividadesAssincronas;

import java.util.Scanner;

public class LacoRepeticaoWhile01 {

	public static void main(String[] args) {
		
		int idade, menos21, mais50;
		idade = menos21 = mais50 = 0;
		
		Scanner leia = new Scanner(System.in);


		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade > 0) {
				menos21++;
			}
			if (idade > 50) {
				mais50++;
			}
			if (idade < 0 ) {
				System.out.println("Total de pessoas menores de 21 anos: " + menos21);
				System.out.println("Total de pessoas maiores de 50 anos: " + mais50);
			}
		}

	}

}
