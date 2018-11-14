/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.*/
public class ej7 {
	public static void main(String[] args) {
	int[] numero = new int[100];
	int i;
	int cambiaNumero;
	int reemplazo;

	for (i=0; i<100; i++) {
		numero[i] = (int)(Math.random()*21);
	}

	for (i=0; i<100; i++) {
		System.out.printf("%d ", numero[i]);
		if ((i%9 == 0) && (i>0)) {
			System.out.println();
		}
	}
	System.out.println("¿Qué número quieres cambiar?");
	cambiaNumero = Integer.parseInt(System.console().readLine());
	System.out.println("¿Por cual?");
	reemplazo = Integer.parseInt(System.console().readLine());

	for (i=0; i<100; i++) {
		if (numero[i] == cambiaNumero) {
			System.out.printf("\"%d\"", reemplazo);
		} else {
			System.out.printf("%d ", numero[i]);
		}
		if (i%9 == 0) {
			System.out.println();
		}
	}

	}
}
