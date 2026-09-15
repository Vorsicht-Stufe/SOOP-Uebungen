package Klausur_WS_22_23;

import java.util.Arrays;

/**Implementieren Sie die Methode "zahlenfilter". Diese nimmt einen String s entgegen und filter dann die
 * Natürlichen Zahlen aus s heraus. Dabei gelten zusammenhängende Zahlenfolgen als eine Zahl. Diese Zahlen werden
 * abschließend in einem Integer-Array zurückgegeben.
 * Hinweis: um einen String in ein Integer umzuwandeln, kann die java-Methode "Integer.parseInt" verwendet werden.
 */

public class Zahlenfilter {
	
	public static int[] zahlenfilter(String s) {
		// Lösung hier
		String[] zahlenAlsString = new String[0];	// Array für die Zahlen als String
		
		// Überprüfen, ob das erste Zeichen von s eine Zahl ist. Falls ja, Array um 1 vergrößern und Zahl einfügen:
		if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			zahlenAlsString = Arrays.copyOf(zahlenAlsString, zahlenAlsString.length + 1);
			zahlenAlsString[0] = "";	// WICHTIG: Wert als "" festlegen. Ansonsten folgt später "null"!!!
			zahlenAlsString[0] = zahlenAlsString[0] + s.charAt(0);	// Zahl hinzufügen
		}
		
		// Restliche Zeichen von s durchgehen:
		for (int i = 1; i < s.length(); i++) {	// bei i = i beginnen
			// Falls das Zeichen eine Zahl ist und das Zeichen zuvor ebenfalls eine Zahl war, Array nicht vergrößern,
			// sondern Zahl an die vorherige Zahl anhängen:
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9') {
				zahlenAlsString[zahlenAlsString.length - 1] = zahlenAlsString[zahlenAlsString.length - 1] + s.charAt(i);
			}
			// Falls das Zeichen eine Zahl ist und das Zeichen zuvor keine Zahl war, Array um 1 vergrößern, neue Zelle
			// mit "" füllen und die Zahl hinzufügen:
			// WICHTIG: Im zweiten Teil der Bedingung (in der Klammer mit oder ("||") arbeiten!!!
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && (s.charAt(i - 1) < '0' || s.charAt(i - 1) > '9')) {
				zahlenAlsString = Arrays.copyOf(zahlenAlsString, zahlenAlsString.length + 1);
				zahlenAlsString[zahlenAlsString.length - 1] = "";
				zahlenAlsString[zahlenAlsString.length - 1] = zahlenAlsString[zahlenAlsString.length - 1] + s.charAt(i);
			}
		}

		int[] rueck = new int[zahlenAlsString.length];	// Array für die Rückgabe in Form von Integern
		
		// Zahlen in Integer umwandeln und in das Integer-Array einfügen:
		for (int i = 0; i < rueck.length; i++) {
			rueck[i] = Integer.parseInt(zahlenAlsString[i]);	// String in Integer umwandeln	
		}

		return rueck;
	}
	
	
	public static void main(String[] args) {
		// zum Testen
		String s = "64abc0.73#+weq1005qweqqö9";
		
		// Sollte [64, 0, 73, 1005, 9] ergeben:
		System.out.println(Arrays.toString(zahlenfilter(s)));
		
	}

}
