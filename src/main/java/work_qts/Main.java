package work_qts;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SomaCalculadora soma = new SomaCalculadora();
		subtraiCalculadora subtrair = new subtraiCalculadora();
		ArrayList<Integer> lista = new ArrayList();
		int condicao = 0;

		while (condicao < 3) {

			String option = JOptionPane.showInputDialog("CALCULADOR MAGICA\n " + "Inserir qual a opção desejada\n"
					+ "1. Somar\n" + "2. Subtrair\n" + "3. Mostrar Lista\n" + "4. Sair");
			int menu = Integer.parseInt(option);

			if (menu == 1) {

				String numero = JOptionPane.showInputDialog("Bora inserir o primeiro numero:\n");
				String numero2 = JOptionPane.showInputDialog("Bora inserir o segundo numero:\n");
				int number01 = Integer.parseInt(numero);
				int number02 = Integer.parseInt(numero2);

				int result = soma.soma(number01, number02);

				JOptionPane.showMessageDialog(null, "O resultado é esse amigo:  " + result);

				lista.add(result);

			}

			if (menu == 2) {

				String numero = JOptionPane.showInputDialog("Bora inserir o primeiro numero:\n");
				String numero2 = JOptionPane.showInputDialog("Bora inserir o segundo numero:\n");
				int number01 = Integer.parseInt(numero);
				int number02 = Integer.parseInt(numero2);

				int result = subtrair.subtrair(number01, number02);

				JOptionPane.showMessageDialog(null, "O resultado é esse amigo:  " + result);

				lista.add(result);

			}

			if (menu == 3) {

				for (int i = 0; i < lista.size(); i++) {

					JOptionPane.showMessageDialog(null, "Resultados Armazenados: " + lista.get(i));
				}
			}

			if (menu == 4) {

				break;

			}

		}

	}

}
