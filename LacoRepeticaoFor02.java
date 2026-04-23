package atividadesAssincronas;

import java.util.Scanner;

public class LacoRepeticaoFor02 {

	public static void main(String[] args) {

		int i, j; 
		int pares = 0;
		int impares = 0;

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + i + " número: ");
			j = leia.nextInt();
			if (j % 2 == 0) {
				pares++;

			} else {
				impares++;
			}
		}
			System.out.println("Total de números pares: " + pares);
			System.out.println("Total de números pares: " + impares);
	}

}
