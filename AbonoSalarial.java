package atividadesAssincronas;

import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {

		//Váriaveis
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		
		//Entrada de Dados
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o seu abono: ");
		abono = leia.nextFloat();
		
		
		//Processamento de Dados
		novoSalario = salario + abono;
		
		
		//Saída de Dados
		System.out.printf("Novo Salário: %.2f", novoSalario);	

	}

}
