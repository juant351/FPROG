import java.util.Scanner;
public class H3EJ6 {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
		System.out.println("Escribir una fecha(dia, mes año)");
		
		int d= in.nextInt();
		int m= in.nextInt();
		int a= in.nextInt();
		
		local(d,m,a);
		extranjera(d,m,a);


		}
	public static void local(int d, int m, int a) {
		System.out.println(d + "/" + m + "/" + a);

	}
	
	public static void extranjera(int d, int m, int a) {
		System.out.println(m + "/" + a + "/" +  d);
	}

}
