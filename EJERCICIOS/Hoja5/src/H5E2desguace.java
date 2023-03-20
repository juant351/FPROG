import java.util.Scanner;
public class H5E2desguace {

	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	int n, num;
	num = 1;
	
	do {
		System.out.println("Teclee un numero positivo");
		n=in.nextInt();
	}while(n<0);
		for (int fil=1; fil<=n; fil++){
			for(int i=1; i<=fil; i++) {
				System.out.print(" " + num);
				num++;
			}
			System.out.println();
		}
	

	}

}