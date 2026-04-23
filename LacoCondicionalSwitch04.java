package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalSwitch04 {

	public static void main(String[] args) {
			
		int codigo;
		float saldo1 = 1000.0f;
		String saldo2 = "1000.00";
		String saque, deposit, invalido;
		
		Scanner leia = new Scanner(System.in);

		System.out.print(" Código		Operação\n"
				+ "1	Saldo\n"
				+ "2	Saque\n"
				+ "3	Depósito\n"
				+ "Operação: ");
		
		
		
		codigo = leia.nextInt();

		
		switch (codigo) {
		case 1:
			System.out.print("Operação - Saldo\n"
							+ "Saldo: R$" + saldo2);
			break;
		case 2:
			System.out.print("Valor: R$ ");
			saque = leia.next();
			float valorF = Float.parseFloat(saque.replace(",", "."));
			if (valorF >= saldo1) {
			    System.out.print("Operação - Saque\n"
			                    + "Saldo Insuficiente!");
			} else {

			    saldo1 -= valorF;
			    String valorS = String.format("%.2f", saldo1).replace(',', '.');
			    System.out.printf("Novo saldo: R$ " + valorS);
			}
			break;
		case 3:
			System.out.print("Valor: R$ ");
			deposit = leia.next();
			float valorF2 = Float.parseFloat(deposit.replace(",", "."));
			saldo1 += valorF2;
			String valorD = String.format("%.2f", saldo1).replace(',', '.');
			    System.out.printf("Operação - Deposit\n"
			                    + "Novo Valor: R$ " + valorD);
		
			break;
		default:
			System.out.print("Valor: R$ ");
			invalido = leia.next();
			float valorI = Float.parseFloat(invalido.replace(",", "."));
			System.out.println("Operação Inválida!");
		}

	}

}
