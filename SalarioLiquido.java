package atividadesAssincronas;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		// Váriaveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		// Processamento de Dados
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		
		System.out.printf("Digite o Salário Líquido: %.2f", salarioLiquido);
	}

}
