import java.util.Scanner;
import java.util.Locale;
public class Ejercicio1{
public static void main (String args []){
	Scanner entrada = new Scanner(System.in);
	int nsegundos ;
	int hh, mm, ss;

	nsegundos=entrada.nextInt();
	//calcular hh, mm, ss
	mm = nsegundos / 60; //puede pasarse de 60
	ss = nsegundos % 60;
        hh = mm/60;
        mm= mm % 60;       

	System.out.print (hh);
	System.out.print (":");
	System.out.print (mm);
	System.out.print (":");
	System.out.print (ss);

	System.out.println ( hh + ":" + mm + ":" + ss);
}
}

