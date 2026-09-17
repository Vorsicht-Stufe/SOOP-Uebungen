package uebung_2;

/*
Schreiben Sie ein Programm, das vom Benutzer zwei Zahlen entgegennimmt und prüft, ob eine dritte eingegebene Zahl im geschlossenen Intervall der ersten beiden Zahlen liegt (recherchieren Sie ggf. was geschlossenes Intervall bedeutet). 
Das Intervall soll auch "in falscher Reihenfolge" eingegeben werden können.
*/

import java.util.Scanner;

public class aufgabe_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Intervallgrenze:");
		int intervallgrenze_1 = scanner.nextInt();
		System.out.println("Intervallgrenze:");
		int intervallgrenze_2 = scanner.nextInt();
		System.out.println("Eine beliebige ganze Zahl:");
		int zahl = scanner.nextInt();
		
		scanner.close();
		
		int grenze_unten = Math.min(intervallgrenze_1, intervallgrenze_2);
		int grenze_oben = Math.max(intervallgrenze_1, intervallgrenze_2);
		
		if (grenze_unten < zahl && zahl < grenze_oben) {
			System.out.println(zahl + " ist im Intervall von " + grenze_unten + " bis " + grenze_oben + ".");
		} else {
			System.out.println(zahl + " ist nicht im Intervall von " + grenze_unten + " bis " + grenze_oben + ".");
		}
	}
}
