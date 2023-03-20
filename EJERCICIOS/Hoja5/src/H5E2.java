//PROGRAMA QUE GENERA UN TRIANGULO RECTANGULO CON NUMEROS
import java.util.Scanner;
public class H5E2 {

	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	int n, num;
	
	do {
		System.out.println("Teclee un numero positivo");
		n=in.nextInt();
	}while(n<0);
		for (int fil=1; fil<=n; fil++){
			for(int i=1; i<=(n-fil); i++)
				System.out.print("  ");
		
			num = fil;
			for(int i=1; i<=fil; i++) {
				System.out.print(" " + (num%10));
				num++;
			}
			System.out.println();
		}
	

	}

}
