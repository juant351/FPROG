import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class Dado {
	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale (Locale.US);

		System.out.println ("¡Ha salido el número " + Math.floor((Math.random()*6)+1) + "!");
	}
}
