/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.*/
public class ej13 {
	public static void main(String[] args) {
	int[] num = new int[100];
	int i;
	int max = 0;
	int min = 501;
	int resaltar;

	for (i=0; i<100; i++) {
		num[i] = (int)(Math.random()*501);
		if (num[i] > max) {
			max = num[i];
		} else if (num[i] < min) {
			min = num[i];
		}
    System.out.printf("%d ", num[i]);
    if ((i%9 == 0) && (i>0)){
			System.out.println();
    }
	}

	System.out.println("¿Qué elemento desea resaltar? (0=El máximo 1=El mínimo):");
	resaltar = Integer.parseInt(System.console().readLine());
	
	switch (resaltar) {
		case 0:
			for (i=0; i<100; i++) {
				if (num[i] == max) {
					System.out.printf("**%d** ", num[i]);
				} else {
					System.out.printf("%d ", num[i]);
				}
				if ((i%9 == 0) && (i>0)){
					System.out.println();
				}
			}
		break;
		case 1:
			for (i=0; i<100; i++) {
				if (num[i] == min) {
					System.out.printf("**%d** ", num[i]);
				} else {
					System.out.printf("%d ", num[i]);
				}
				if (i%9 == 0) {
					System.out.println();
				}
			}
		break;
	}
	System.out.printf("\nFIN\n"); 
   
	}
}
