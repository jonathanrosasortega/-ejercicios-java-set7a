/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.*/
public class ej10 {
	public static void main(String[] args) {
	int[] num = new int[20];
	int[] numFinal = new int[20];
	int i;
	int numPares = 0;
	
	for (i=0; i<20; i++) {
		num[i] = (int)(Math.random()*101);
		System.out.printf("%d ", num[i]);
		if (num[i]%2 == 0) {
			numFinal[numPares] = num[i];
			numPares++;
		}
	}
	System.out.println("\nAlterado:");

	for (i=0; i<20; i++) {
		if (num[i]%2 != 0) {
			numFinal[numPares] = num[i];
			numPares++;
		}
		System.out.printf("%d ", numFinal[i]);
	}
	System.out.printf("\nFIN\n");   
	}
}