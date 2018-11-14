/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/
public class ej14 {
	public static void main(String[] args) {
	int i;
	int j;
	String[] palabra = new String[8];
	String[] color = new String[9];
	String[] palabraFinal = new String[8];
	int numColores = 0;
	boolean coincidencia = false;

	color[0] = "verde";
	color[1] = "rojo";
	color[2] = "azul";
	color[3] = "amarillo";
	color[4] = "naranja";
	color[5] = "rosa";
	color[6] = "negro";
	color[7] = "blanco";
	color[8] = "morado";

	for (i=0; i<8; i++) {
		System.out.println("Introduce palabra " + i + " :");	
		palabra[i] = System.console().readLine();
		for (j=0; j<9; j++) {
			if (palabra[i].equals(color[j])) { // 
				palabraFinal[numColores] = color[j];
				numColores++;
			}
		}
	}

	System.out.println("\nArray:");
	for (i=0; i<8; i++) {
		System.out.printf("%d	", i);
	}
	System.out.println();
	for (i=0; i<8; i++) {
		System.out.printf("%s	", palabra[i]);
	} //Muestra de datos por pantalla (Array inicial)
  
	for (i=0; i<8; i++) {
		coincidencia = false;
    for (j=0; (j<9) && (coincidencia == false); j++) {
      if (palabra[i].equals(color[j])) {
				coincidencia = true;
			}
    }
    if (coincidencia == false) {
      palabraFinal[numColores] = palabra[i];
			numColores++;
		}
	}//Comprobación de coincidencias
  
	System.out.println("\n\nAlterado:");
	for (i=0; i<8; i++) {
		System.out.printf("%d	", i);
	}
	System.out.println();
	for (i=0; i<8; i++) {
		System.out.printf("%s	", palabraFinal[i]);
	}

	System.out.printf("\nFIN\n");
   
	}
}
