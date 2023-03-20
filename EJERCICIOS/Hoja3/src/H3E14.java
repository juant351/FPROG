//PROGRAMA QUE TE DA UNA FECHA LARGA CON DIA Y MES EN LETRAS A PARTIR DE 3 NUMEROS ENTEROS.
import java.util.Scanner;
import java.util.Locale;
public class H3E14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		System.out.println("Introduzca tres numeros enteros: ");
		int dia = in.nextInt();
		int mes = in.nextInt();
		int año = in.nextInt();
		
		System.out.println("Introduzca dia de la semana: ");
		in.nextLine();
		
		String dsemana = in.nextLine();
		fechaLarga(dsemana,dia,mes,año);
		
	}
	public static void fechaLarga(String dsemana, int dia, int mes, int año) {
		String jamonth = "";
		switch (mes) {
		case 1 : jamonth = "enero";
		break;
		case 2 : jamonth = "febrero";
		break;
		case 3 : jamonth = "marzo";
		break;
		case 4 : jamonth = "abril";
		break;
		case 5 : jamonth = "mayo";
		break;
		case 6 : jamonth = "junio";
		break;
		case 7 : jamonth = "julio";
		break;
		case 8 : jamonth = "agosto";
		break;
		case 9 : jamonth = "septiembre";
		break;
		case 10 : jamonth = "octubre";
		break;
		case 11 : jamonth = "noviembre";
		break;
		case 12 : jamonth = "diciembre";
		break;
		default: System.out.println("Ha introducido un mes que no existe");
		
		}
		System.out.println(dsemana+", "+dia+" de "+jamonth+" del "+año);

    }
}
