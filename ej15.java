/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto,
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
personas como máximo e intente de nuevo”. Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. */
public class ej15 {
	public static void main(String[] args) {
	int[] mesas = new int[10];
	int i;
	int grupoEntrante;

	for(i=0; i<10; i++) {
		mesas[i] = (int)(Math.random()*5);
	}

	do {
		System.out.print("Mesa nº:    ");
		for (i=0; i<10; i++) {
			System.out.printf("%3d", i+1);
		}
		System.out.println();
		System.out.print("Ocupación:  ");

		for (i=0; i<10; i++) {
			System.out.printf("%3d", mesas[i]);
		}
    
		System.out.println("\nIntroduzca el nº de personas del grupo:");
		grupoEntrante = Integer.parseInt(System.console().readLine());
		if (grupoEntrante != -1) {
			if (grupoEntrante>4) {
				System.out.println("Lo siento, no admitimos grupos de " + grupoEntrante + ", haga grupos de 4 personas como máximo e intente de nuevo:");
			} else {
				//busca mesa vacia
				boolean grupoSentado = false;
				for (i=0; (i<10) && (grupoSentado==false); i++) {
					if (mesas[i] == 0) {
						mesas[i] = grupoEntrante;
						grupoSentado = true;
						System.out.println("Por favor, siéntese en la mesa número" + (i+1));
					}
				}
				// En caso de falta de mesas, se intenta acoplar a mesas que no están completamente llenas
				if (grupoSentado == false) {
					for (i=0; (i<10) && (grupoSentado==false); i++) {
						if (mesas[i] + grupoEntrante <= 4) {
							mesas[i] += grupoEntrante;
							grupoSentado = true;
							System.out.println("Tendrán que compartir mesa. ");
							System.out.println("Por favor, siéntese en la mesa número" + (i+1));
						}
					}
				} //grupoSentado sigue a false. No hay hueco

				if (grupoSentado == false) {
					System.out.println("Lo siento, en estos momentos no queda sitio.");
				}
				System.out.println("\n");
			}
		}
	} while (grupoEntrante!=-1);

	System.out.printf("\nFIN");
	}
}
