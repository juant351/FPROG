//METODO FECHAS (EEUU/ESPAÑA/ etc)
import java.util.Scanner;
public class H3E6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Introduzca 3 numeros enteros");
		int dia = in.nextInt();
		int mes = in.nextInt();
		int año = in.nextInt();
		System.out.println("Si desea la fecha en formato local pulse la tecla 1, pulse 2 para formato extranjero");
		int eleccion = in.nextInt();
		
		if(eleccion==1) {
			if(dia<10 & mes<10) {
				System.out.println("La fecha es: "+"0"+ dia + "/0" + mes +"/"+ año);	
			}
			else if(dia<10 & mes>10){
			    System.out.println("La fecha es: "+"0"+ dia + "/"+ mes +"/"+ año);	
			}
			else if(dia>10 & mes<10) {
			    System.out.println("La fecha es: "+ dia + "/0"+ mes +"/"+ año);	
			}
			else{
			    System.out.println("La fecha es: "+ dia + "/"+ mes +"/"+ año);	
			}
			
		}
		else if(eleccion==2){
			if(dia<10 & mes<10) {
				System.out.println("La fecha es: " +"0"+ mes + "/" + año +"/0"+ dia);
			}
			else if(dia<10 & mes>10){
			    System.out.println("La fecha es: "+mes+"/"+año+"/0"+dia);	
			}
			else if(dia>10 & mes<10) {
				System.out.println("La fecha es: "+"0"+mes+"/"+año+"/"+dia);
			}
			else {
				System.out.println("La fecha es: "+mes+"/"+año+"/"+dia);

			}
		}
		in.close();

	}

}
