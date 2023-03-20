//Programa realizado por Hector Toribio Gonzalez y Juan Torres Viloria.
import java.util.Scanner;

public class palabrasMegaApiladas {

	public static void main(String[] args) {
		// Mensaje introductorio y peticion del tipo de modo.
		Scanner in = new Scanner(System.in);
		System.out.println(
				"El juego consiste en eliminar de un tablero todas las palabras que aparecen en vertical u horizontal,\r\n"
						+ "leidas de forma directa o inversa. Cuando se elimina una palabra, el resto de las letras caen para\r\n"
						+ "ocupar los huecos.\r\n"
						+ "Cuando se ha conseguido vaciar el tablero, se acumulan tantos puntos como letras constituian el\r\n"
						+ "tablero inicialmente. Se dispone para ello de un diccionario de palabras, y en cada juego solo\r\n"
						+ "aparecen en el tablero algunas de las palabras del diccionario. ¡Esperamos que lo disfrutes!");

		System.out.println();
		String volverajugar="";
		do{
			System.out.println("Introduce la letra p o la letra P para entrar en el modo pruebas y cualquier otro caracter para entrar en el juego:");

			String letra = in.nextLine(); // variable para decidir el modo de juego que se va a seleccionar.

			char[] coordenadas; //coordenadas de la palabra seleccionada por el usuario.
			int fila; //filas del tablero.
			int columna; //columnas del tablero.
			String direccion; //direccion de la palabra seleccionada por el usuario.
			int longitud; //longitud de la palabra seleccionada por el usuario.
			String palabra; //palabra seleccionada por el usuario.
			String decision; //alberga la decision del usuario sobre borrar o no lapalabra que ha seleccionado.
			int palabrasactuales = 10;//Número de palabras encontradas
			int NUMEROMINIMOPALABRAS=0;//Número máximo de palabras en una partida

			int numeropalabras=0;
			// MODO PRUEBAS
			if (letra.equals("p") || letra.equals("P")) {
				String[] listaPalabras = { "AAA", "AAAAAA", "BBBBBBBBB", "CCCCC", "DDDDD", "EEEEE", "FFFFF", "GGGGG",
						"HHHHH", "IIIII", "JJJJJ" };

				System.out.println();
				char[][] matriz = NuevaMatriz.nuevaMatriz(10, 10, listaPalabras); // Creacion del tablero

				do {
					matriz = NuevaMatriz.nuevaMatriz(10, 10, listaPalabras); // Creacion del tablero
					imprimematriz(matriz); // Imprime tablero
					
					while(palabrasactuales > 0) {
						if(!palabrasLegibles(listaPalabras, matriz)) {
							System.out.println("¡Hemos reordenado el tablero para que puedas seguir jugando!");
							matriz = NuevaMatriz.nuevaMatriz(10, 10, listaPalabras);
							imprimematriz(matriz);
						}
						do {


							coordenadas = getCoordenadas(); // Obtiene y comprueba coordenadas.

							fila = Character.getNumericValue(coordenadas[0]);
							columna = Character.getNumericValue(coordenadas[1]);
							direccion = Character.toString(coordenadas[2]);
							longitud = Character.getNumericValue(coordenadas[3]);

							// 1 - Obtener palabra dentro de la matriz
							palabra = getPalabra(matriz, fila, columna, direccion, longitud);

							System.out.println(palabra);

							System.out.println("¿Quiere eliminar la palabra que se encuentra en esta posicion? (Si/No)");
							decision = in.nextLine();

						}while(decision.equals("No") || decision.equals("NO") || decision.equals("no") || decision.equals("nO"));

						// 2 - Comprobar si es una palabra de nuestra lista.
						if (decision.equals("Si") || decision.equals("SI") || decision.equals("si") || decision.equals("sI")) {
							boolean pertenece = false; //comprobar si pertenece o no la palabra seleccionada por el usuario a nuestra lista de palabras.
							for(int i = 0; i < listaPalabras.length; i++) {
								if(palabra.equals(listaPalabras[i])) {
									pertenece = true; //la palabra pertenece a nuestra lista.
								}
							}
							if(!pertenece) {
								System.out.println();
								imprimematriz(matriz);
								System.out.println("¡Has encontardo una palabra que no estaba en el diccionario! "
										+ "No se ha eliminado, pero tu puntuacion ha aumentado en una unidad");
							}

							// 3 - Eliminar la palabra.
							else {
								char[][] nMatriz = eliminarpalabra(matriz, fila, columna, direccion, longitud, palabrasactuales); //llamada al metodo que elimina la palabra deseada.
								System.out.println();
								imprimematriz(nMatriz); //llamada al metodo que imprime la matriz con la palabra eliminada.	
							}

						}
					}
					System.out.println("Enhorabuena, has conseguido encontrar las 10 palabras");
					System.out.println();
					System.out.println("¿Deseas jugar de nuevo?");
					volverajugar=in.nextLine(); //decision del usuario para jugar de nuevo o no.

				}while(palabrasactuales > NUMEROMINIMOPALABRAS);

			} else { // MODO NORMAL.
				String[] listaPalabrasNormal = { "CHICOS", "PIZZA", "TORTILLA", "MADRE", "CHICLE", "AULA", "PULIDO", "PUMA",
						"DEDO", "MATRIZ", "SIETE", "PRUEBA", "CHUPITO", "HERRETE", "GALLETA" };

				System.out.println();

				int puntuacion = 10;
				System.out.println("\t\t\t Puntuacion actual: " + puntuacion);
				System.out.println();

				do {
					char[][] matriz = NuevaMatriz.nuevaMatriz(10, 10, listaPalabrasNormal); // Creacion del tablero
					imprimematriz(matriz); // Imprime tablero
					
					while(palabrasactuales > 0) {
						if(!palabrasLegibles(listaPalabrasNormal, matriz)) {
							System.out.println("¡Hemos reordenado el tablero para que puedas seguir jugando!");
							matriz = NuevaMatriz.nuevaMatriz(10, 10, listaPalabrasNormal);
							imprimematriz(matriz);
						}
						do {


							coordenadas = getCoordenadas(); // Obtiene y comprueba coordenadas.

							fila = Character.getNumericValue(coordenadas[0]);
							columna = Character.getNumericValue(coordenadas[1]);
							direccion = Character.toString(coordenadas[2]);
							longitud = Character.getNumericValue(coordenadas[3]);

							// 1 - Obtener palabra dentro de la matriz
							palabra = getPalabra(matriz, fila, columna, direccion, longitud);

							System.out.println(palabra);

							System.out.println("¿Quiere eliminar la palabra que se encuentra en esta posicion? (Si/No)");
							decision = in.nextLine();

						}while(decision.equals("No") || decision.equals("NO") || decision.equals("no") || decision.equals("nO"));

						// 2 - Comprobar si es una palabra de nuestra lista.
						if (decision.equals("Si") || decision.equals("SI") || decision.equals("si") || decision.equals("sI")) {
							boolean pertenece = false; //comprobar si pertenece o no la palabra seleccionada por el usuario a nuestra lista de palabras.
							for(int i = 0; i < listaPalabrasNormal.length; i++) {
								if(palabra.equals(listaPalabrasNormal[i])) {
									pertenece = true; //la palabra pertenece a nuestra lista.
								}
							}
							if(!pertenece) {
								puntuacion++;
								System.out.println("\t\t\t Puntuacion actual: " + puntuacion);
								System.out.println();
								imprimematriz(matriz);
								System.out.println("¡Has encontardo una palabra que no estaba en el diccionario! "
										+ "No se ha eliminado, pero tu puntuacion ha aumentado en una unidad");
							}

							// 3 - Eliminar la palabra.
							else {
								char[][] nMatriz = eliminarpalabra(matriz, fila, columna, direccion, longitud, palabrasactuales); //llamada al metodo que elimina la palabra deseada.
								System.out.println("\t\t\t Puntuacion actual: " + puntuacion);
								System.out.println();
								imprimematriz(nMatriz); //llamada al metodo que imprime la matriz con la palabra eliminada.	
							}

						}
					}
					System.out.println("Enhorabuena, has conseguido encontrar las 10 palabras");
					System.out.println();
					puntuacion += puntuar(matriz);
					System.out.println("Tu puntuación final es de: " + puntuacion);
					System.out.println("¿Deseas jugar de nuevo?");
					volverajugar=in.nextLine(); //decision del usuario para jugar de nuevo o no.

				}while(palabrasactuales > NUMEROMINIMOPALABRAS);

			}

		}while(volverajugar=="si"||volverajugar=="sI"||volverajugar=="Si"||volverajugar=="SI");

	}
	
	//Metodo para ver si hay palabras legibles en el tablero.
	public static String palabraExis(String palabra, String [] listaPalabras) {
		for(int i = 0; i < listaPalabras.length; i++) {
			if(palabra.contains(listaPalabras[i])) {
				return listaPalabras[i];
			}
		}
		return null;

	}

	
	public static boolean palabrasLegibles (String[] listaPalabras, char[][] matriz) {
		boolean exist = false;
		for(int j = 0; j < matriz[0].length; j++) {
			String palabraColumna = "";
			//Buscar palabra en sur.
			for(int i = 0; i < matriz.length; i++) {
				palabraColumna += matriz[i][j];
			}
			if(palabraExis(palabraColumna, listaPalabras) != null){
				exist = true;
			}
			palabraColumna = "";

			//Buscar palabra en norte.
			for(int i =  matriz.length - 1; i > 0; i--) {
				palabraColumna += matriz[i][j];
			}
			if(palabraExis(palabraColumna, listaPalabras) != null){
				exist = true;
			}
		}
		for(int j = 0; j < matriz.length; j++) {
			String palabraFila = "";
			//Buscar palabra en este.
			for(int i = 0; i < matriz[0].length; i++) {
				palabraFila += matriz[i][j];
			}
			if(palabraExis(palabraFila, listaPalabras) != null){
				exist = true;
			}
			palabraFila = "";

			//Buscar palabra en oeste.
			for(int i =  matriz[0].length - 1; i > 0; i--) {
				palabraFila += matriz[i][j];
			}
			if(palabraExis(palabraFila, listaPalabras) != null){
				exist = true;
			}
		}
		return exist;
	}
	// Metodo que obtiene las coordenadas de una palabra.
	public static char[] getCoordenadas() {
		String entrada;
		Scanner coor = new Scanner(System.in);

		System.out.println("Introduce las coordenadas de la palabra que encuentres (fila, columna, direccion y longitud)");
		boolean comprobacion = true;

		char[] coordenadas = new char[4];

		while (comprobacion) {

			entrada = coor.nextLine();
			entrada = entrada.replaceAll("\\s", "");

			if (entrada.length() != 4) {
				System.out.println("La entrada no es correcta. Introduzca de nuevo las coordenadas por favor: ");
			} else {

				System.out.println();
				coordenadas[0] = entrada.charAt(0);
				coordenadas[1] = entrada.charAt(1);
				coordenadas[2] = entrada.charAt(2);
				coordenadas[3] = entrada.charAt(3);

				if (coordenadas[2] != 'N' & coordenadas[2] != 'n' & coordenadas[2] != 'S' & coordenadas[2] != 's'
						& coordenadas[2] != 'E' & coordenadas[2] != 'e' & coordenadas[2] != 'O'
						& coordenadas[2] != 'o') {

					System.out.println("Escriba de nuevo las coordenadas con la direccion correcta por favor");

				} else {

					System.out.println("Fila: " + coordenadas[0]);
					System.out.println("Columna: " + coordenadas[1]);
					System.out.println("Direccion: " + coordenadas[2]);
					System.out.println("Longitud: " + coordenadas[3]);

					comprobacion = false;
				}

			}

		}

		return coordenadas;
	}

	// Metodo para la puntuacion.
	public static int puntuar( char[][] matriz) {
		int letras = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				if (matriz[i][j] != ' ') {
					letras++;
				}

		}
		return letras;
	}

	// Metodo para generar la matriz.
	public static void imprimematriz(char[][] matriz) {
		System.out.println("  0 1 2 3 4 5 6 7 8 9");
		System.out.println(" ---------------------");
		int n = 0; // Variable para orla
		for (int i = 0; i < 10; i++) {
			System.out.print(n + "|");
			for (int j = 0; j < 10; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println("|" + n);
			n++;
		}
		System.out.println(" ---------------------");
		System.out.println("  0 1 2 3 4 5 6 7 8 9");
	}

	// Metodo para obtener la palabra deseada dentro de la matriz
	public static String getPalabra(char[][] matriz, int fila, int columna, String direccion, int longitud) {
		String palabra = "";
		if (direccion.equals("S") || direccion.contentEquals("s")) {
			for (int i = 0; i < longitud; i++) {
				palabra = palabra + Character.toString(matriz[fila + i][columna]);
			}
		} else if (direccion.equals("N") || direccion.contentEquals("n")) {
			for (int i = 0; i < longitud; i++) {
				palabra = palabra + Character.toString(matriz[fila - i][columna]);
			}
		} else if (direccion.equals("E") || direccion.contentEquals("e")) {
			for (int i = 0; i < longitud; i++) {
				palabra = palabra + Character.toString(matriz[fila][columna + i]);
			}
		} else if (direccion.equals("O") || direccion.contentEquals("o")) {
			for (int i = 0; i < longitud; i++) {
				palabra = palabra + Character.toString(matriz[fila][columna - i]);
			}
		}
		return palabra;
	}
	// Metodo para eliminar palabra.
	public static char[][] eliminarpalabra(char[][] matriz, int fila, int columna, String direccion, int longitud, int palabrasactuales) {
		char[][] nMatriz = matriz;
		int incrementofila = 1;// Incremento de fila para ir subiendo en la matriz
		int incrementocolumna = 1;
		if (direccion.equals("N") || direccion.contentEquals("n")) {

			for (int i = fila; i >= 0; i--) {
				if(i - longitud >= 0) {
					nMatriz[i][columna] = nMatriz[i-longitud][columna];	
				}else{
					nMatriz[i][columna] = ' ';

				}

			}
			palabrasactuales--;

		} else if (direccion.equals("S") || direccion.contentEquals("s")) {
			for (int i = fila + longitud-incrementocolumna; i>=0; i--) {
				if(i-longitud >= 0) {
					nMatriz[i][columna] = nMatriz[i-longitud][columna];	
				}else{
					nMatriz[i][columna] = ' ';

				}

			}
			palabrasactuales--;
		} else if (direccion.equals("E") || direccion.contentEquals("e")) {
			while (fila > 0) {
				for (int i = 0; i < longitud; i++) {
					if (Character.toString(nMatriz[fila - incrementofila][columna + i]) != " ") {
						nMatriz[fila][columna + i] = nMatriz[fila - incrementofila][columna + i];
						if (fila == 1) {
							nMatriz[fila - incrementofila][columna + i] = ' ';
						}
					} else if (Character.toString(nMatriz[fila - incrementofila][columna + i]) == " ") {
						nMatriz[fila][columna + i] = ' ';
						if (fila == 1) {
							nMatriz[fila - incrementofila][columna + i] = ' ';
						}
					}

				}
				fila = fila - incrementofila;
			}
			palabrasactuales--;
		} else if (direccion.equals("O") || direccion.contentEquals("o")) {

			while (fila > 0) {
				for (int i = 0; i < longitud; i++) {
					if (Character.toString(nMatriz[fila - incrementofila][columna - i]) != " ") {
						nMatriz[fila][columna - i] = nMatriz[fila - incrementofila][columna - i];
						if (fila == 1) {
							nMatriz[fila - incrementofila][columna - i] = ' ';
						}
					} else if (Character.toString(nMatriz[fila - incrementofila][columna - i]) == " ") {
						nMatriz[fila][columna - i] = ' ';
						if (fila == 1) {
							nMatriz[fila - incrementofila][columna - i] = ' ';
						}
					}

				}
				fila = fila - incrementofila;
			}
			palabrasactuales--;
		}
		return nMatriz;
	}
}