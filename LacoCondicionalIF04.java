package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalIF04 {

	public static void main(String[] args) {

		
		String nome1, nome2, nome3;
		Scanner leia = new Scanner(System.in);

		
		System.out.println("O nimal é Vertebrado ou Invertebrado? ");
		nome1 = leia.next();
		if (nome1.equalsIgnoreCase("vertebrado")) {
			System.out.println("O animal pertence ao grupo Ave ou Mamífero? ");
			nome2 = leia.next();
			if (nome2.equalsIgnoreCase("ave")) {
				System.out.println("O animal é Carnívoro ou Onívoro? ");
				nome3 = leia.next();
				if (nome3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Então é a Águia!");
				} else if (nome3.equalsIgnoreCase("onivoro")) {
					System.out.println("Então é a Pomba!");
				}
			} else if (nome2.equalsIgnoreCase("mamifero")) {
				System.out.println("O animal é Onívoro ou Herbívoro? ");
				nome3 = leia.next();
				if (nome3.equalsIgnoreCase("onivoro")) {
					System.out.println("Então é o Homem!");
				} else if (nome3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Então é a Vaca!");
				}
			}
			
			
		} else if (nome1.equalsIgnoreCase("invertebrado")) {
			System.out.println("O animal pertence ao grupo Inseto ou Anelídeo? ");
			nome2 = leia.next();
			if (nome2.equalsIgnoreCase("inseto")) {
				System.out.println("O animal é Hematófago ou Herbívoro? ");
				nome3 = leia.next();
				if (nome3.equalsIgnoreCase("hematofago")) {
					System.out.println("Então é a Pulga!");
				} else if (nome3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Então é a Lagarta!");
				}
			} else if (nome2.equalsIgnoreCase("anelideo")) {
				System.out.println("O animal é Hematófago ou Onivoro? ");
				nome3 = leia.next();
				if (nome3.equalsIgnoreCase("hematofago")) {
					System.out.println("Então é a Sanguessuga!");
				} else if (nome3.equalsIgnoreCase("onivoro")) {
					System.out.println("Então é a Minhoca!");
				}
			}
		}
	}
}