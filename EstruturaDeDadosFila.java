package atividadesAssincronas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDeDadosFila {

	public static void main(String[] args) {

		int x = 1;
		int contador = 1;
		Queue<String> clientes = new LinkedList<String>();
		

		while (x != 0) {
			System.out.println("\n1	-	Adicionar Cliente a Fila \n" 
		+ "2	-	Listar todos Clientes \n"
		+ "3	-	Retirar Cliente da Fila \n" 	
		+ "0	-	Sair \n" 
		+ "4	-	Quantos Clientes há na Pilha \n"
		+ "Entre com a opção desejada: \n");

			Scanner leia = new Scanner(System.in);
			int escolha = leia.nextInt();


			if (escolha == 1) {
				System.out.println("\nDigite o nome do Cliente: \n");
				String nome = leia.next();
				clientes.add(nome);
				Iterator<String> iterador = clientes.iterator();
				System.out.println("\nFila: \n");
				while (iterador.hasNext()) {
					System.out.println(iterador.next());
				}
				System.out.println("\nCliente Adicionado! \n");
			} else if (escolha == 2) {
				if (clientes.isEmpty() == true) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
				System.out.println("\nLista de Clientes na Fila:  \n");
				Iterator<String> iterador = clientes.iterator();
				while (iterador.hasNext()) {
					System.out.println("[" + contador + "] " + iterador.next());
					contador++;
				} contador = 1;
				}
			} else if (escolha == 3) {
				if (clientes.isEmpty() == true) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					System.out.println("\nCliente '" + clientes.remove() + "' retirado da fila.\n");
					contador = 1;
				}
			} else if (escolha == 4) {
				if (clientes.isEmpty() == true) {
					System.out.println("\nNão há nenhum Cliente na Fila! \n");
				} else if (clientes.size() == 1) {
					System.out.println("\nHá 1 Cliente na Fila! \n");
				} else {
				System.out.println("\nHá " + clientes.size() + " Clientes na Fila! \n");
				}
					
				}else { 
				System.out.println("\nPrograma Finalizado!");
				break;
			}
		}
	}
}
