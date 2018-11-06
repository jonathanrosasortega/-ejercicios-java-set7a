/*Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.*/
public class ej5 {
	public static void main(String[] args) {
	int[] numero = new int[10];
	int i;
	int max = 0;
	int min = 999;

	for (i=0; i<10; i++) {
		System.out.println("Introduce el número " + (i+1) + " :");
		numero[i] = Integer.parseInt(System.console().readLine());
		if (numero[i] > max) {
			max = numero[i];
		} else if (numero[i] < min) {
			min = numero[i];
		}
	}

	for (i=0; i<10; i++) {
		if (numero[i] == max) {
			System.out.printf("%d máximo\n", numero[i]);
		} else if (numero[i] == min) {
			System.out.printf("%d mínimo\n", numero[i]);
		} else {
			System.out.printf("%d\n", numero[i]);
		}
	}   
	}
}
