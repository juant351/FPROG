//PROGRAMA QUE TRANSFORMA GRADOS EN RADIANES Y VICEVERSA
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class H3E5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        in.useLocale(Locale.US);
        double grad, rad;
        System.out.println("¿Qué va a introducir grados o radianes? (Grados=pulse 1. Radianes=pulse 2)");
        int eleccion = in.nextInt();
        if(eleccion == 1) {
        	System.out.println("Introduzca los grados");
        	grad = in.nextDouble();
        	rad = (grad*Math.PI)/180;
        	
        	System.out.println("En radianes es: " + rad);
        }
        else if(eleccion == 2){
        	System.out.println("Introduzca los radianes");
        	rad = in.nextDouble();
        	grad = (rad*180)/Math.PI;
        	
        	System.out.println("En grados es: " + grad + "º");
        	
        }
		

	}

}
