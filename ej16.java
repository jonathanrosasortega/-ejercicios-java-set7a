/*Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
array escribiendo los números que se quieren resaltar entre corchetes.*/
public class ej16 {
	public static void main(String[] args) {
	int[] num = new int[20];
	int opcion;
  int i;

	for (i=0; i<20; i++) {
		num[i] = (int)(Math.random()*401);
		System.out.printf("%d ", num[i]);
	}

	System.out.println("\n¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7):");
	opcion = Integer.parseInt(System.console().readLine());

	System.out.println();
	switch (opcion) {
		case 1:
			for (i=0; i<20; i++) {
				if (num[i]%5 == 0) {
					System.out.printf("[%d] ", num[i]);
				} else {
					System.out.printf("%d ", num[i]);
				}
			}
		break;
		case 2:
			for (i=0; i<20; i++) {
				if (num[i]%7 == 0) {
					System.out.printf("[%d] ", num[i]);
				} else {
					System.out.printf("%d ", num[i]);
				}
			}
		break;
		default:
	}

	System.out.printf("\nFIN");
   
	}
}
