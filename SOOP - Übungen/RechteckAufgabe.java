/*
Mit dem Programm sollen Rechteckberechnungen durchgeführt werden. Erweitern Sie das Programm so, dass es die folgenden Aufgaben erfüllt:

    Einlesen der Länge eines Rechtecks von der Konsole
    Einlesen der Breite eines Rechtecks von der Konsole
    Berechnung des Umfangs des Rechtecks
    Berechnung der Fläche des Rechtecks
    Ausgabe der Ergebnisse (Anzeige der Eingabe, des Umfangs und der Fläche)

Achten Sie darauf, dass Sie nur einen einzigen Scanner für beide Eingaben (Länge und Breite) verwenden. Insbesondere in den Miniprojekten kann Jack Ihre Lösung sonst nicht überprüfen und wertet sie als falsch.
*/

import java.util.Scanner;

public class RechteckAufgabe {

	public static void main(String[] args) {
		int laenge = 0;
		int breite = 0;
		int flaeche = 0;
		int umfang = 0;

		// Eingabe:
		// Um eine Eingabe von Usern zu ermöglichen, muss in Java ein sogenannter Scanner benutzt werden. Dieser muss dazu initialisiert werden
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wie lang ist das Rechteck?")
		laenge = scanner.nextLine();
		System.out.println("Wie breit ist das Rechteck?")
		breite = scanner.nextLine();

		// Da wir mit allen notwendigen Eingaben durch Anwendende fertig sind, sollte der Scanner geschlossen werden
		scanner.close;

		// Berechnung:
		umfang = 2 * laenge + 2 * breite;
		flaeche = laenge * breite;

		// Ausgabe:
        System.out.println("Bei einer Länge von " + laenge + " und einer Breite von " + breite + "\n hat das Rechteck eine Fläche von " + flaeche + " und einen Umfang von " + umfang + );

	}
}