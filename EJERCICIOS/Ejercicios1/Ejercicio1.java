public class Ejercicio1 {
	public static void main(String[] args){
		int s = 75936 ,m ,h;
		m = s/60;
		s = s % 60;
		h = (m/60) +12;
		while(h>24){
			h = h-24;
		}
		m = m % 60;
		System.out.println( h + ":" + m +":" + s);
	}
}
