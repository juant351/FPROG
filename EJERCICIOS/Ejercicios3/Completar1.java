import java.util.Locale;
import java.util.Scanner;

public class Completar1 {
	public static void main (String[] args){
		/* De polares a cartesianas, dim 2 */
		Scanner in = new Scanner (System.in);
		in.useLocale (Locale.US);
		double x, y; double angulo, radio;

		System.out.print ("Escriba un ángulo (en radianes): ");
		angulo = in.nextDouble();
		System.out.print ("y un radio (positivo): ");
		radio = in.nextDouble();
		x=radio*Math.cos(angulo);
		y=radio*Math.sin(angulo);
		System.out.println ("Ángulo " + angulo + ", radio " + radio);
		System.out.print ("El punto en cartesianas es ");
		System.out.print("("+x+","+y+")"); //SENTENCIA
	
	}
}

