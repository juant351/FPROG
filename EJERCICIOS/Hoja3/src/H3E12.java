//PROGRAMA QUE DA EL AREA DE UN TRIANGULO A PARTIR DE TRES VALORES POSITIVOS
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class H3E12 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 in.useLocale(Locale.US);
		 double x; double y; double z;
		 
		 System.out.println("Introduzca tres valores positivos");
		 x = in.nextDouble(); y = in.nextDouble(); z = in.nextDouble();
		 
		 System.out.println("El area del triangulo es: " + ar(x,y,z));
	} 
		 public static double ar(double x, double y, double z) {
			 double area;
			 double s;
			 s = (x+y+z)/2;
			 area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
			 return area;
		 
	}

}
