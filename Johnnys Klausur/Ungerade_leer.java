package Klausur_WS_22_23_leer;

import java.util.Arrays;

/**Implementieren Sie die Methode "ungerade". Diese filter aus einem Array die ungeraden Zahlen
 * heraus und liefert ein neues Array mit den ungeraden Zahlen zurück
 */

public class Ungerade_leer {
	
	public static int[] ungerade(int[] zahlen) {
		// Lösung hier
	}
	
	public static void main(String[] args) {
		// zum Testen
		int[] a = {4, 17, 44, -33, 5, 0, 20, 101};
		
		// Sollte [17, -33, 5, 101] ergeben:
		System.out.println(Arrays.toString(ungerade(a)));
	}
	
}
