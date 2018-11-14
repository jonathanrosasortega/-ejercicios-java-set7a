/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/
public class ej8 {
	public static void main(String[] args) {
	int[] mes = new int[12];
	int i;

	for (i=0; i<12; i++) {
		mes[i] = (int)(Math.random()*41);
		System.out.printf("Mes %d: ", i+1, mes[i]);
		for (int j=1; j<=mes[i]; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.printf("\nFIN\n");
   
	}
}
