/*Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir
un número al usuario. Se debe comprobar que el número introducido por
teclado se encuentra dentro del array, en caso contrario se mostrará un
mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
introduzca uno correctamente. A continuación, el programa rotará el array
hacia la derecha las veces que haga falta hasta que el número introducido
quede situado en la posición 0 del array. Por último, se mostrará el array rotado
por pantalla.*/
public class ej17 {
	public static void main(String[] args) {
	int[] num = new int[10];
	int numero;
	boolean presente = false;
	int i;
	int primero;

	for (i=0; i<10; i++) {
		num[i] = (int)(Math.random()*100+1);
		System.out.printf("%d ", num[i]);
	}

	do {
    System.out.println("\nIntroduzca un número del array:");
		numero = Integer.parseInt(System.console().readLine());
		for (i=0; i<10; i++) {
			if (num[i] == numero) {
				presente = true;
			}
		}
	} while (presente == false);
	
	do {
		primero = num[9];
		for (i=9; i>0; i--) {
			num[i] = num[i-1];
		}
		num[0] = primero;
	} while(num[0] != numero);
	
  for (i=0; i<10; i++) {
		System.out.printf("%d ", num[i]);
	}
  
	System.out.printf("\nFIN");
   
	}
}
