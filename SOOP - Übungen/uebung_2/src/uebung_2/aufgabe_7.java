package uebung_2;

/*
Schreiben Sie ein Programm, das verschiedene physikalische Berechnungen durchführen kann. Folgende Berechnungen sollen möglich sein:

    (0) Geschwindigkeit aus Weg und Zeit
    (1) Kraft aus Masse und Beschleunigung
    (2) Widerstand aus Spannung und Stromstärke
    (3) Leistung aus Spannung und Stromstärke

Lesen Sie zuerst eine Benutzereingabe ein, die festlegt, welche Operation ausgeführt werden soll. Verwenden Sie die oben angegebenen Zahlen zwischen 0 und 3.

Lesen Sie danach zwei weitere Zahlen als Benutzereingabe ein. Diese Zahlen repräsentieren die Eingabe der ausgewählten Berechnung. Berechnen Sie das Ergebnis und geben Sie es aus.
 */

import java.util.Scanner;

public class aufgabe_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double ergebnis = 0;
		double parameter1 = 0;
		double parameter2= 0;
		
		System.out.println("Welche Operation soll durchgeführt werden?\n"
				+ "  (0) Geschwindigkeit aus Weg und Zeit\n"
				+ "  (1) Kraft aus Masse und Beschleunigung\n"
				+ "  (2) Widerstand aus Spannung und Stromstärke\n"
				+ "  (3) Leistung aus Spannung und Stromstärke");
		int operation = scanner.nextInt();

		switch(operation) {
		case 0: // geschwindigkeit = strecke / zeit
			System.out.println("Zurückgelegte Strecke: ");
			parameter1 = scanner.nextDouble();
			System.out.println("Benötigte Zeit: ");
			parameter2 = scanner.nextDouble();
			ergebnis = parameter1 / parameter2;
			System.out.println("Die Geschwindigkeit beträgt:" + ergebnis);
			break;
			
		case 1: // kraft = masse * beschleunigung
			System.out.println("Masse: ");
			parameter1 = scanner.nextDouble();
			System.out.println("Beschleunigung: ");
			parameter2 = scanner.nextDouble();
			ergebnis = parameter1 * parameter2;
			System.out.println("Die Kraft beträgt: " + ergebnis);
			break;
			
		case 2: // widerstand = spannung / stronstärke
			System.out.println("Spannung: ");
			parameter1 = scanner.nextDouble();
			System.out.println("Stromstärke: ");
			parameter2 = scanner.nextDouble();
			ergebnis = parameter1 / parameter2;
			System.out.println("Der Widerstand beträgt: " + ergebnis);
			break;
			
		case 3: // leistung = spannung * stromstärke
			System.out.println("Spannung: ");
			parameter1 = scanner.nextDouble();
			System.out.println("Stromstärke: ");
			parameter2 = scanner.nextDouble();
			ergebnis = parameter1 * parameter2;
			System.out.println("Die Leistung beträgt: " + ergebnis);
			break;
		
		default:
			System.out.println(operation + " ist keine gültige Operation");
			break;
		}
		System.out.println("All done. Bye :)");
		
		scanner.close();
	}
}
