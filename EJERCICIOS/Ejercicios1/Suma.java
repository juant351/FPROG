import java.util.Locale;
import java.util.Scanner;
public class Suma {
	public static void main (String args []) {
		/* Suma dos números reales(...)
		 * Entrada: 2 números por teclado
		 * Salida: su suma
		 * */
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale (Locale.US);
		double x, y ;
		double suma ;
                System.out.print ("Escriba un número : ");
		//leer x e y
		x = teclado.nextDouble ();
		System.out.print ("Escriba otro número : ");
		y = teclado.nextDouble ();
		suma = x+y;
		System.out.println ("Su suma es : " + suma);
		}
}
