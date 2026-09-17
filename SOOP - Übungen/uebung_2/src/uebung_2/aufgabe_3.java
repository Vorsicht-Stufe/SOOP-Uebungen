package uebung_2;

/*
Schreiben Sie ein Programm, das zwei ganze Zahlen als Benutzereingabe entgegennimmt und geben Sie die größere der beiden Zahlen aus. Falls die Zahlen gleich groß sind geben Sie eine entsprechende Meldung aus.
*/

import java.util.Scanner;

public class aufgabe_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie eine ganze Zahl ein:");
		int zahl1 = scanner.nextInt();
		System.out.println("Geben Sie eine ganze Zahl ein:");
		int zahl2 = scanner.nextInt();
		
		scanner.close();
		
		if (zahl1 == zahl2) {
			System.out.println("Die Zahlen sind haben beide den Wert" + zahl1 + ".");
		} else if (zahl1 > zahl2) {
			System.out.println(zahl1 + " ist größer als " + zahl2 + ".");
		} else if (zahl2 > zahl1) {
			System.out.println(zahl2 + " ist größer als " + zahl1 + ".");
		}
		
	}
}
