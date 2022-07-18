package ejercicios3.java;

public class ArrayMayor {

	public static void main(String[] args) {
		
		int max;
		int array[]=new int[6];
		
		System.out.println("Llenar array con números aleatorios entre 1 y 100");
			
		System.out.println("Los números aleatorios añadidos son: ");
			
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100 +1);
			System.out.println(array[i]);
		}
		max=NumeroMayor.numeroMaximo(array);
		System.out.println("El número mayor es: " +max);
		
	}
	
	public static class NumeroMayor{
		static int numeroMaximo(int array[]) {
			
			int max=array[0];
			
			for(int i=0;i<array.length;i++) {
				if(array[i]>max) {
					max=array[i];
				}
			}
			return max;
		}
	}
}
