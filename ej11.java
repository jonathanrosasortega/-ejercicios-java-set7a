/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante.*/
public class ej11 {
	public static void main(String[] args) {
	int[] num = new int[10];
	int[] numFinal = new int[10];
	int i;
	int j;
	int numPrimos = 0;
	boolean primo = true;
	
	for (i=0; i<10; i++) {
		System.out.println("Introduce número " + (i+1) + ":");
		num[i] = Integer.parseInt(System.console().readLine());
		primo = true;
		for (j=2; j<=(num[i]/2); j++) {
			if (num[i]%j == 0) {
				primo = false;
			}
		}
		if (primo == true) {
    		numFinal[numPrimos] = num[i];
			numPrimos++;
		}
	}
	System.out.printf("1  2  3  4  5  6  7  8  9  10 \n");
	for (i=0; i<10; i++) {
		System.out.printf("%d", num[i]);
	}
	System.out.println("\n\nAlterado:");
	System.out.printf("1  2  3  4  5  6  7  8  9  10 \n");
	for (i=0; i<10; i++) {
		primo = true;
		for (int j=2; j<=(num[i]/2); j++) {
			if (num[i]%j == 0) {
				primo = false;
			}
		}
		if (primo == false) {
    		numFinal[numPrimos] = num[i];
			numPrimos++;
		}
		System.out.printf("%d ", numFinal[i]);
	}
	System.out.printf("\nFIN\n");   
	}
}