//PROGRAMA QUE DEVUELVE EL MENOR DE 3 NUMEROS INTRODUCIDOS
import java.util.Scanner;
import java.util.Locale;
public class H3E10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		double x, y, z;
		
		System.out.println("Introduca 3 números");
		x = in.nextDouble(); y = in.nextDouble(); z = in.nextDouble();
		
		double[] lista = {x,y,z};
		double min;
		
		min = lista[0];
		for(int i=1; i<lista.length; i++) {
			if(min>lista[i]) {
				min=lista[i];
			}
		}
		System.out.println("El mínimo es: "+ min);

	}

}
