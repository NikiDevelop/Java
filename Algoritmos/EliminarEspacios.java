// Eliminar los espacios de las frases

import javax.swing.JOptionPane;

public class EliminarEspacios {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog(null, "Escribe una frase: ", "Insercion",
				JOptionPane.INFORMATION_MESSAGE);

		char caracterActual;

		String texto_sin_espacios = "";

		for (int i = 0; i < texto.length(); i++) {

			caracterActual = texto.charAt(i);

			if (caracterActual != ' ') {
				texto_sin_espacios += caracterActual;
			}
		}
		JOptionPane.showMessageDialog(null, texto_sin_espacios, " Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
	


