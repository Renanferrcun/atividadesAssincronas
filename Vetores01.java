package atividadesAssincronas;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		boolean encontrado = false;
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();


		for(int i = 0; i < vetorInteiros.length; i++) {
			if(numero == vetorInteiros[i]) {
				System.out.println("O número " + numero + " está localizado na posição " + i);
				encontrado = true;		
			}	
		}
		
		
		if(encontrado != true) {
				System.out.println("O número " + numero + " não foi encontrado!");
		}
	}
}
