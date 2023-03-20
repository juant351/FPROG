import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Raices {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale (Locale.US);
		double x;
		System.out.println ("Escriba un número positivo para obtener sus raíces cuadrada, cúbica, cuarta y quinta");
		x = teclado.nextDouble ();
		System.out.println ("La raíz cuadrada es:  " + Math.sqrt(x));
		System.out.println ("La raíz cubica es: " + Math.pow(x, 1/3.0));
		System.out.println ("La raíz cuarta es: " + Math.pow(x, 1/4.0));
		System.out.println ("La raíz quinta es: " + Math.pow(x, 1/5.0));
	}
}

