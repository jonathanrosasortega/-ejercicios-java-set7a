/*Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.*/
public class ej9 {
	public static void main(String[] args) {
	int[] num = new int[8];
	int i;

	for (i=0; i<8; i++) {
		System.out.println("Introduce número :");
		num[i] = Integer.parseInt(System.console().readLine());
	}
  System.out.printf("\nFIN\n");  
  
	for (i=0; i<8; i++) {
		if (num[i]%2 == 0) {
			System.out.printf("%d \"par\"\n", num[i]);
		} else {
			System.out.printf("%d \"impar\"\n", num[i]);
		}
		
	}
	System.out.printf("\nFIN\n");   
	}
}
