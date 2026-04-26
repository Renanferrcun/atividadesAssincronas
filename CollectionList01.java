package atividadesAssincronas;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String s;
		
		
		System.out.println("Insira 5 nomes de cores: ");

		for(int i = 0; i < 5;i++) {
			s = leia.next();
			cores.add(s);
		}
		
		System.out.println("Listar todas as cores: \n");
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println();

		cores.sort(null);
		System.out.println("Ordenar as cores: \n");
			for (String cor : cores) {
				System.out.println(cor);
			}
		}
	}
