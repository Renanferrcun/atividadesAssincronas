package atividadesAssincronas;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class CollectionSet02 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> setNumeros = new LinkedHashSet<Integer>();
		
		System.out.println("Digite o número a ser encontrado: ");
		Integer encontrar = leia.nextInt();
		
		
		Integer lista[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

			
		 for (Integer num : lista) {
			 setNumeros.add(num);
		 }
		 
		 
		 if (setNumeros.contains(encontrar)) {
			System.out.println("O número " + encontrar + " foi encontrado!");
		} else {
			System.out.println("O número " + encontrar + " não foi encontrado!");
		}
	}
}
