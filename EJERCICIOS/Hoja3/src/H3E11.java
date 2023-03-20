//PROGRAMA QUE VERIFICA SI ES POSIBLE O NO HACER UN TRIANGULO CON 3 NUMEROS INTRODUCIDOS
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class H3E11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		double x; double y; double z;
		
		System.out.println("Introduce los 3 numeros");
		x = in.nextDouble(); y = in.nextDouble(); z = in.nextDouble();
		
		if(triangulo(x,y,z)) {
			System.out.println(triangulo(x,y,z));
		}
		else
			System.out.println(triangulo(x,y,z));
		in.close(); 
	}
	public static boolean triangulo(double x, double y, double z) {
		double xy, xz, yz;
		xy= x+y; xz= x+z; yz= y+z;
		
		boolean sepuede = true;
		if(z>xy || x>yz || y>xz) {
			sepuede=false;
		}
		return sepuede;
	}
	
	

}
