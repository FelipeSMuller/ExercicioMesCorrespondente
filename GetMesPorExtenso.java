package exerciciosLivro;

import javax.swing.JOptionPane;

public class GetMesPorExtenso {

	public static void mesPorExtensoPortugues(int mes) {
		String[] mesesPortugues = { "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };

		if (mes == 0) {

			showMessage();
		} else if (mes >= 1 && mes <= 12) {
			JOptionPane.showMessageDialog(null, "Idioma Português\nMês " + mesesPortugues[mes]);
		} else {
			JOptionPane.showMessageDialog(null, "Mês inválido");
		}
	}

	public static void mesPorExtensoIngles(int mes) {
		String[] mesesIngles = { "", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };

		if (mes == 0) {
			showMessage();
		} else if (mes >= 1 && mes <= 12) {
			JOptionPane.showMessageDialog(null, "Idioma Inglês\nMês " + mesesIngles[mes]);
		} else {
			JOptionPane.showMessageDialog(null, "Mês inválido");
		}
	}

	public static void mesPorExtensoEspanhol(int mes) {
		String[] mesesEspanhol = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };

		if (mes == 0) {
			showMessage();
		} else if (mes >= 1 && mes <= 12) {
			JOptionPane.showMessageDialog(null, "Idioma Espanhol\nMês " + mesesEspanhol[mes]);
		} else {
			JOptionPane.showMessageDialog(null, "Mês inválido");
		}
	}

	public static void showMessage() {
		JOptionPane.showMessageDialog(null,
				"Os meses iniciam em 1 , sendo Janeiro o primeiro, não é possivel inserir números negativos ou igual a ZERO(0)");
	}
}