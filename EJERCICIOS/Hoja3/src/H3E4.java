//CORRECION DE UN PROGRAMA QUE DA ANGULO Y RADIO DE UNAS COORDENADAS
import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;
public class H3E4 {
       public static void main (String[] args){
       /* De cartesianas a polares, dim 2 */
              Scanner in = new Scanner (System.in);
              in.useLocale(Locale.US);
              double x, y;
              
              System.out.print ("Escriba las 2 coordenadas de un punto: ");
              x = in.nextDouble(); y = in.nextDouble();
              
              System.out.println ("Punto ("+ x + ", " + y + ")");
              System.out.print ("En polares es: ");
              System.out.println ( "Radio= " + rad(x,y) + ", angulo = " + ang (x,y));// EXPRESIONES
       }
       public static double rad (double x, double y) {
    	   double radio;
    	   radio= Math.sqrt(x*x+y*y);
    	   return radio;
       }
       public static double ang (double x, double y) {
    	   double angulo;
    	   angulo= Math.atan(y/x);
    	   return angulo;
       }
}