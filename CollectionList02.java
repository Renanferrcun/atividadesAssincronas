package atividadesAssincronas;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(9);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int encontrar = leia.nextInt();
		
		
		if (numeros.contains(encontrar)){
			System.out.print("O número " + encontrar + " está localizado na posição "  
					+ numeros.indexOf(encontrar));
		} else {
			System.out.println("O número " +  encontrar + " não foi encontrado!");
		}
	}
}

