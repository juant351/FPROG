//GENERA UN TRIANGULO PIRAMIDAL
import java.util.Scanner;
public class H5E4 {

	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	int n, num;
			
		do {
			System.out.println("Teclee un numero positivo");
			n=in.nextInt();
		}while(n<0);
		   
		for (int fil=1; fil<=n; fil++){
			for(int i=1; i<=(n-fil); i++)
				System.out.print("   ");
				
			num=fil;
			for(int i=1; i<=fil; i++) {
				System.out.print("  "+(num%10));
				num++;
			}
			num=num-2;
			for(int i=1; i<=(fil-1); i++) {
				System.out.print("  "+(num%10));
				num--;
			}
			System.out.println();
		}

	}
}

	


