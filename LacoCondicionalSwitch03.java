package atividadesAssincronas;

import java.util.Scanner;

public class LacoCondicionalSwitch03 {

	public static void main(String[] args) {
			
		String valor1, valor2;
		int codigo;
		float valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		valor1 = leia.next();
		float numero1 = Float.parseFloat(valor1.replace(",", "."));
		
		System.out.print("Digite o segundo número: ");
		valor2 = leia.next();
		float numero2 = Float.parseFloat(valor2.replace(",", "."));

		System.out.println(" Código		Operação\n"
				+ "1	Soma\n"
				+ "2	Subtração\n"
				+ "3	Multiplicação\n"
				+ "4	Divisão\n");
		
		codigo = leia.nextInt();

		
		switch (codigo) {
		case 1:
			valor = numero1 + numero2;
			//System.out.print(valor);
			String w = Float.toString(valor);
			float soma = Float.parseFloat(w.replace(",", "."));
			System.out.printf(numero1 + " + " + numero2 + " = " + soma);
			break;
		case 2:
			valor = numero1 - numero2;
			//System.out.print(valor);
			String x = Float.toString(valor);
			float subtracao = Float.parseFloat(x.replace(",", "."));
			System.out.printf(numero1 + " - " + numero2 + " = " + subtracao);
			break;
		case 3:
			valor = numero1 * numero2;
			//System.out.print(valor);
			String y = Float.toString(valor);
			float multiplicacao = Float.parseFloat(y.replace(",", "."));
			System.out.printf(numero1 + " * " + numero2 + " = " + multiplicacao);
			break;
		case 4:
			valor = numero1 / numero2;
			//System.out.print(valor);
			String z = Float.toString(valor);
			float divisao = Float.parseFloat(z.replace(",", "."));
			System.out.printf(numero1 + " / " + numero2 + " = " + divisao);
			break;
		default:
			System.out.println("Operação Inválida!");
				
		}

	}

}
