package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalSwitch02 {

	public static void main(String[] args) {
			
		String nome, salarioS;
		int codigo;
		float  reajuste, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Nome do Colaborador: ");
		nome = leia.nextLine();
		System.out.print(" Código do Cargo  	Cargo 	       Percentual do Reajuste\n"
				+ " 	1		Gerente   	  	  10%\n"
				+ "	2		Vendedor		  7%\n"
				+ "	3		Supervisor		  9%\n"
				+ "	4		Motorista		  6%\n"
				+ "	5		Estoquista	  	  5%\n"
				+ "	6		Técnico de TI	  	  8%\n"
				+ "Cargo: ");
		codigo = leia.nextInt();
		System.out.print("Salário: R$ ");
		salarioS = leia.next();
		float salario = Float.parseFloat(salarioS.replace(",", "."));
		
		switch (codigo) {
		case 1:
			reajuste = 0.10f;
			novoSalario = salario + (reajuste * salario);
			String t = String.format("%.2f", novoSalario).replace(',', '.');
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.print("Salário: R$ " + t);
			break;
		case 2:
			reajuste = 0.07f;
			novoSalario = salario + (reajuste * salario);
			String u = String.format("%.2f", novoSalario).replace(',', '.');
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.print("Salário: R$ " + u);
			break;
		case 3:
			reajuste = 0.09f;
			novoSalario = salario + (reajuste * salario);
			String v = String.format("%.2f", novoSalario).replace(',', '.');
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.print("Salário: R$ " + v);
			break;
		case 4:
			reajuste = 0.06f;
			novoSalario = salario + (reajuste * salario);
			String x = String.format("%.2f", novoSalario).replace(',', '.');
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.print("Salário: R$ " + x);
			break;
		case 5:
			reajuste = 0.05f;
			novoSalario = salario + (reajuste * salario);
			String y = String.format("%.2f", novoSalario).replace(',', '.');
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.print("Salário: R$ " + y);
			break;
		case 6:
			reajuste = 0.08f;
			novoSalario = salario + (reajuste * salario);
			String z = String.format("%.2f", novoSalario).replace(',', '.');
			System.out.println("Nome do Colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.print("Salário: R$ " + z);
			break;
		default:
			System.out.println("Inválido");
				
		}

	}

}
