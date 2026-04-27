package atividadesAssincronas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class EstruturaDeDadosPilha {

	public static void main(String[] args) {

		int x = 1;
		int contador = 1;
		Deque<String> pLivros = new ArrayDeque<String>();
		

		while (x != 0) {
			System.out.println("\n1	-	Adicionar Livro na Pilha \n" 
		+ "2	-	Listar todos os Livros \n"
		+ "3	-	Retirar Livro da Fila \n"
		+ "4	-	Quantos Livros há na Pilha \n"
		+ "0	-	Sair \n" 
		+ "Entre com a opção desejada: \n");

			Scanner leia = new Scanner(System.in);
			int escolha = leia.nextInt();


			if (escolha == 1) {
				System.out.println("\nDigite o nome do Livro: ");
				leia.nextLine();
				String livro = leia.nextLine();
				pLivros.add(livro);
				Iterator<String> iterador = pLivros.iterator();
				System.out.println("\nPilha: \n");
				while (iterador.hasNext()) {
					System.out.println(iterador.next());
				}
				System.out.println("\nLivro Adicionado! \n");
			} else if (escolha == 2) {
				if (pLivros.isEmpty() == true) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
				System.out.println("\nLista de Livros na Pilha:  \n");
				Iterator<String> iterador = pLivros.iterator();
				while (iterador.hasNext()) {
					System.out.println("[" + contador + "] " + iterador.next());
					contador++;
				}contador = 1;
				}
			} else if (escolha == 3) {
				if (pLivros.isEmpty() == true) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					System.out.println("\nLivro '" + pLivros.remove() + "' removido da Pilha.\n");
					contador = 1;
				}
			} else if (escolha == 4) {
				if (pLivros.isEmpty() == true) {
					System.out.println("\nNão há nenhum Livro na Pilha!\n");
				} else if (pLivros.size() == 1) {
					System.out.println("\nHá 1 Livro na Pilha!\n");
				} else {
				System.out.println("\nHá " + pLivros.size() + " Livros na Pilha!\n");
				}
					
				} else { 
				System.out.println("\nPrograma Finalizado!");
				break;
			}
		}
	}
}
