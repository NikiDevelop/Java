public class Dados {

	public static void main(String[] args) {
		//Creamos una aplicacion que nos genere la tirada de 3 dados 
		//y que sume los numeros que han salido
		int dado;
		int suma = 0;
   		#Generamos la tirada de 3 dados 
		System.out.println("La tirada de 3 dados es: ");
		for (int i = 0; i < 3; i++) { 
			//Invocamos Math random para que nos genere un numero random 
			dado = (int) (Math.random() * 6) + 1; 
			System.out.println(dado + " "); 
			//la variable suma va sumando los numeros generados 
			suma += dado; 
		}
		System.out.println("Suma total: " + suma);
	}
}
