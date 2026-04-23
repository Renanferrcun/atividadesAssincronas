package atividadesAssincronas;

import java.util.Scanner;

public class LacoRepeticaoFor01 {

	public static void main(String[] args) {

		int i;
		// int j;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro intervalo: ");
		int x = leia.nextInt();
		System.out.println("Digite o segundo intervalo: ");
		int j = leia.nextInt();

		if (j < x) {
			System.out.println("Intervalo Inválido!");
		} else {
			for (i = x; i <= j; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}

		}

	}

}
