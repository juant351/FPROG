//METODO FECHA (CON DIA DE LA SEMANA)
import java.lang.String;
import java.util.Scanner;

public class H3E7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Introduzca dia, mes y a�o: ");
		int dia = in.nextInt();
		int mes = in.nextInt();
		int a�o = in.nextInt();
		
		System.out.println("Introduzca dia de la semana: ");
		in.nextLine();
		
		String dsemana = in.nextLine();
		fechaLarga(dsemana,dia,mes,a�o);
		

	}
	public static void fechaLarga(String dsemana, int dia, int mes, int a�o) {
		System.out.println(dsemana+", "+dia+" del "+mes+" del "+a�o);
	}
		
}
