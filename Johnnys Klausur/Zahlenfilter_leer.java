package Klausur_WS_22_23_leer;

import java.util.Arrays;

/**Implementieren Sie die Methode "zahlenfilter". Diese nimmt einen String s entgegen und filter dann die
 * Natürlichen Zahlen aus s heraus. Dabei gelten zusammenhängende Zahlenfolgen als eine Zahl. Diese Zahlen werden
 * abschließend in einem Integer-Array zurückgegeben.
 * Hinweis: um einen String in ein Integer umzuwandeln, kann die java-Methode "Integer.parseInt" verwendet werden.
 */

public class Zahlenfilter_leer {
	
	public static int[] zahlenfilter(String s) {
		// Lösung hier
	}
		
	public static void main(String[] args) {
		// zum Testen
		String s = "64abc0.73#+weq1005qweqqö9";
		
		// Sollte [64, 0, 73, 1005, 9] ergeben:
		System.out.println(Arrays.toString(zahlenfilter(s)));		
	}

}