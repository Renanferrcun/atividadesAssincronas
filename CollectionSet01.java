package atividadesAssincronas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet01 {
	
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Set<Integer> setNumeros = new HashSet<Integer>();
		Integer n;
		
		
		System.out.println("Digite 10 Números, um por vez: ");
	
		for (int i = 0; i < 10; i++) {
			n = leia.nextInt();
			numeros.add(n);
		}
		

		setNumeros.addAll(numeros);
		
	
		System.out.println("Listar dados do Set: \n");
	
	
		Iterator<Integer> iNumeros = setNumeros.iterator();
	
	
		while (iNumeros.hasNext()) {
		System.out.println(iNumeros.next());
		}

	}		
}