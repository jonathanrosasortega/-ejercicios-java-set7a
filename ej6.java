/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/
public class ej6 {
	public static void main(String[] args) {
	int[] array = new int[15];
	int i;
	int ultimo;
	
	for (i=0; i<15; i++) {
		System.out.println("Introduce el número " + (i+1) + " :");
		array[i] = Integer.parseInt(System.console().readLine());
	}
	for (i=0; i<15; i++) {
		System.out.printf("%d ", array[i]);
	}

	ultimo = array[14];
	for (i=14; i>=1; i--) {
		array[i] = array[i-1];
	}
	array[0] = ultimo;
  System.out.println("\nArray adelantado:");
	System.out.println();
	for (i=0; i<15; i++) {
		System.out.printf("%d ", array[i]);
	}

	}
}
