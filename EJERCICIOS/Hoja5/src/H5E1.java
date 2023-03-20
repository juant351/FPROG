//PROGRAMA QUE GENERA UN TRIANGULO RECTANGULO
import java.util.Scanner;
public class H5E1 {

	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	int n;
	
	do {
		System.out.println("Teclee un numero positivo");
		n=in.nextInt();
	}while(n<0);
	
	for (int fil=1; fil<=n; fil++){
		for(int i=1; i<=(n-fil); i++)
		System.out.print(" ");
		for(int i=1; i<=fil; i++)
			System.out.print("*");
		System.out.println();
	}
	

	}

}
