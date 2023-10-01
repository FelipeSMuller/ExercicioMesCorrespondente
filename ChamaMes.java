package exerciciosLivro;

import javax.swing.JOptionPane;

public class ChamaMes {

	public static void main(String[] args) {

		/*
		 * Faça uma classe chamada Mes que possua um método chamado getMesPorExtenso que
		 * recebe um número inteiro, referente ao mês do ano, um código referente ao
		 * idioma (1 para português e 2 para inglês) e retorne o mês por extenso.
		 */

		int userInput = 0;

		int inputMonth = 0;

		do {

			try {

				userInput = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Escolha um idioma \n1-Português \n2-Inglês \n3-Espanhol"));

				inputMonth = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite um número referente a um mês, sendo 1 para Janeiro e assim por diante...."));

				if (userInput == 0 || inputMonth == 0) {

					JOptionPane.showMessageDialog(null, "Você inseriu opções inválidas, tente novamente!!!");
				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você fechou o programa incorretamente ou inseriu dados inválidos nesse campo!!!!");

				JOptionPane.showMessageDialog(null, erro.getMessage());

			}

			switch (userInput) {

			case 1:

				GetMesPorExtenso.mesPorExtensoPortugues(inputMonth);

				break;

			case 2:

				GetMesPorExtenso.mesPorExtensoIngles(inputMonth);

				break;

			case 3:

				GetMesPorExtenso.mesPorExtensoEspanhol(inputMonth);

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Você não selecionou nenhum idioma, portanto a aplicação foi finalizada");

				break;

			}

		} while (userInput > 0);

	}

}
