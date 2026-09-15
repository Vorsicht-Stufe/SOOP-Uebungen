package Klausur_WS_22_23;

import java.util.Arrays;

/**Implementieren Sie die Methode "ungerade". Diese filter aus einem Array die ungeraden Zahlen
 * heraus und liefert ein neues Array mit den ungeraden Zahlen zurück
 */

public class Ungerade {
	
	public static int[] ungerade(int[] zahlen) {
		// Lösung hier
		int[] ungerade = new int[0];
		
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] % 2 !=0) {
				ungerade = Arrays.copyOf(ungerade, ungerade.length + 1);
				ungerade[ungerade.length - 1] = zahlen[i];
			}
		}
		return ungerade;
	}
	
	public static void main(String[] args) {
		// zum Testen
		int[] a = {4, 17, 44, -33, 5, 0, 20, 101};
		
		// Sollte [17, -33, 5, 101] ergeben:
		System.out.println(Arrays.toString(ungerade(a)));
	}
	
}
