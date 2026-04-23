package atividadesAssincronas;

import java.util.Scanner;

public class LacoRepeticaoWhile02 {

	public static void main(String[] args) {

		int total, idade, genero, dev, numdev, mulherCis, homemCis, 
			naoBinario, mulherTrans, homemTrans, outros, backEnd,
			frontEnd, mobile, fullStack, mais40, menos30, mFrontend, hMobile, nbFullstack;

		total = idade = genero = dev = numdev = mulherCis = homemCis = 
				naoBinario = mulherTrans = homemTrans = outros = 
				backEnd = frontEnd = mobile = fullStack = 
				mais40 = menos30 = mFrontend = hMobile = nbFullstack = 0;
		
		float somaIdade, pessoas, media;
		somaIdade = pessoas = media = 0.0f;
		
		

		String continua = "";

		Scanner leia = new Scanner(System.in);
		
		while (!continua.equalsIgnoreCase("n")) {
			
		System.out.println("Idade: ");
		idade = leia.nextInt();
		somaIdade += idade;
		pessoas++;
		total++;
		 
		
		if(idade >= 40) {
			mais40++;
			
		} else if ( idade <= 30) {
			menos30++;
		}
			System.out.println("Identidade de Gênero: \n" 
		+ "1 – Mulher Cis \n" 
		+ "2 – Homem Cis \n"					
		+ "3 – Não Binário \n" 
		+ "4 – Mulher Trans \n" 
		+ "5 – Homem Trans \n" 
		+ "6 – Outros \n");
			genero = leia.nextInt();

			switch (genero) {
			case 1:
				mulherCis++;
				break;
			case 2:
				homemCis++;
				break;
			case 3:
				naoBinario++;
				break;
			case 4:
				mulherTrans++;
				break;
			case 5:
				homemTrans++;
				break;
			case 6:
				outros++;
				break;
			}

			System.out.println("Pessoa Desenvolvedora: \n" 
					+ "1 – Backend \n" 
					+ "2 – Frontend \n" 
					+ "3 – Mobile \n"
					+ "4 – FullStack \n");
			dev = leia.nextInt();

			switch (dev) {
			case 1:
				backEnd++;
				break;
			case 2:
				frontEnd++;
				if (genero == 1 || genero == 4 ) {
					mFrontend++;
				}
				break;
			case 3:
				mobile++;
				if (idade > 40 && genero == 2 || genero == 5 ) {
					hMobile++;
				}
				break;
			case 4:
				fullStack++;
				if (idade < 3 && genero == 3 ) {
					hMobile++;
				}
				break;
			}

			System.out.println("Deseja continuar a leitura dos dados" + " de um novo colaborador? (S/N) ");
			continua = leia.next();

			if (continua.equalsIgnoreCase("n")) {

				System.out.println(
						"Total de pessoas Backend: " + backEnd);

				System.out.println(
							"Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mFrontend);

				System.out.println(
						"Total de Homens Cis e Trans desenvolvedores Frontend Mobile maiores de 40 anos: " + hMobile);
				
				System.out.println(
						"Total de pessoas Não Binárias desenvolvedoras Fullstack menores de 30 anos: " + nbFullstack);
				System.out.println(
						"Total de pessoas que responderam a pesquisa: " + total);
				media = somaIdade / pessoas;
				String resultado = String.format("%.2f", media).replace(',', '.');
				System.out.println("Média de idade das pessoas que responderam a pesquisa: " + resultado);

			}

		}

	}
}
