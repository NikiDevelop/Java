//Tendremos que introducir una frase y la aplicacion nos dira cuantas vocales hay

import javax.swing.JOptionPane;

public class ContarVocales{

	public static void main(String[] args) {
			
		String texto = JOptionPane.showInputDialog(null, "Escribe una frase: ", "Insercion", JOptionPane.INFORMATION_MESSAGE);
		texto= texto.toLowerCase();
		
		char vocales[]= {'a', 'e', 'i', 'o', 'u'};
		
		char caracterActual;
		int contadorVocal=0;
		boolean esVocal=false;

		for(int i=0; i<texto.length(); i++) {
			caracterActual=texto.charAt(i);
			esVocal=false;
			for(int j=0; j<vocales.length && !esVocal; j++) {
				if(vocales[j]==caracterActual) {
					contadorVocal++;
					esVocal=true;
				}
			}
						
		}
		
		JOptionPane.showMessageDialog(null, "La frase tiene "+contadorVocal+ " vocal/es", texto, JOptionPane.INFORMATION_MESSAGE);
	}

}
