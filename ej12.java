/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
ambos números están entre 0 y 9. El programa deberá colocar el número de
la posición inicial en la posición final, rotando el resto de números para que no
se pierda ninguno. Al final se debe mostrar el array resultante.*/
public class ej12 {
	public static void main(String[] args) {
	int[] num = new int[10];
	int i;
	int auxiliar;
	int inicial = 999;
	int numFinal = 0;
	
	for (i=0; i<10; i++) {
		System.out.println("Introduce número " + (i+1) + ":");
		num[i] = Integer.parseInt(System.console().readLine());
	}
	System.out.println("\nArray:		");
	System.out.print("\nÍndice:	");
	for (i=0; i<10; i++) {
		System.out.printf("%3d", i);
	}
	System.out.print("\nValor: ");
	for (i=0; i<10; i++) {
		System.out.printf("%3d", num[i]);
	}

	do {
		System.out.println("\nIntroduce número inicial:");
		inicial = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce número final:");
		numFinal = Integer.parseInt(System.console().readLine());
	} while(inicial>=numFinal);

	auxiliar = num[9];
	for (i=9; i>numFinal; i--) {
		num[i] = num[i-1];
	}
  num[numFinal] = num[inicial];
	for (i=inicial; i>0; i--) {
		num[i] = num[i-1];
	}
	num[0] = auxiliar;

	System.out.println("\nArray alterado:");
	System.out.print("\nÍndice: ");
	for (i=0; i<10; i++) {
		System.out.printf("%3d", i);
	}
	System.out.printf("\nValor: ");
	for (i=0; i<10; i++) {
		System.out.printf("%3d", num[i]);
	}
	
	System.out.printf("\nFIN\n");   
	}
}
