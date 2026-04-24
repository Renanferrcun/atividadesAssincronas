package atividadesAssincronas;

import java.util.Scanner;

public class Vetores02 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int vetorNumeros[] = new int[10];
		int i = 0;
		
		
		System.out.println("Escolha 10 números, digite um por vez e aperte enter entre cada um: ");
		for(i = 0; i < 10; i++) {
			vetorNumeros[i] = leia.nextInt();
		}
		
		
		int total = vetorNumeros.length;
		
		int totalImpar = 0;
		int totalPar = 0;
		
		
		for(i = 0; i < total; i++) {
	        for (i = 0; i < vetorNumeros.length; i++) {
	        	
	            if (i % 2 != 0) totalImpar++;   // odd index
	            
	            if (vetorNumeros[i] % 2 == 0) totalPar++; // even value
	        }
		}	
		
		
			
		int indicesImpares[] = new int[totalImpar];
		int numerosPares[] = new int[totalPar];

		
		
		int idxImpar = 0;
		int idxPar = 0;
		int soma = 0;
			
		
		for(i = 0; i < vetorNumeros.length; i++) {
			soma += vetorNumeros[i];
			
			if (i % 2 != 0) {
			indicesImpares[idxImpar++] = vetorNumeros[i];
			}
			}


		for(i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] % 2 == 0) {
				numerosPares[idxPar++] = vetorNumeros[i];
			}
		}
		
		
		System.out.print("Elementos nos índices ímpares: ");
		for(i = 0; i < idxImpar; i++) {
		System.out.print(indicesImpares[i]);
		}
		
		System.out.print("\n");
		
		System.out.print("Elementos pares: ");
		for(i = 0; i < idxPar; i++) {
		System.out.print(numerosPares[i]);
		}
		
		
		float media = (float) soma / total;
		String resultado = String.format("%.2f", media).replace(',', '.');
		
		System.out.print("\n");
		
		System.out.print("Soma " + soma + "\n");
		System.out.print("Média " + resultado + "\n");
	}
}