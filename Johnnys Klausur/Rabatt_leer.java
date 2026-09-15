package Klausur_WS_22_23_leer;

/**Implementieren Sie die Methode "rabatt". Diese liefert den Rabatt, den der Kunde, je nach Punktestand seines
 * Punktekontos, erhält.
 * Die Tabelle der Punkte und ihrer zugehörigen Rabatte in Prozent sieht wie folgt aus:
 * 
 *     Punkte     | Rabatt
 * -------------------------
 *    < 1500      |   0
 *   1500 - 2999  |   5
 *   3000 - 5999  |   7
 *   6000 - 8999  |   10
 *   9000 - 11999 |   12
 *    > 12000     |   15 
 */

public class Rabatt_leer {
	
	public static int rabatt(int punkte) {
		// Lösung hier
	}
	
	public static void main(String[] args) {
		// Zum Testen
		// Soll 7 ergeben:
		System.out.println(rabatt(3500));
		
		// Soll 12 ergeben:
		System.out.println(rabatt(9000));		
	}
	
}
