package uebung_2;

/*
Schreiben Sie ein Programm, das eine ganze Zahl im Intervall [0, 9999] als Benutzereingabe entgegennimmt und das deutsche Zahlwort ausgibt.

Die Aufgabe ist ohne Schleife lösbar. Eine Schleife würde die Lösung eher verkomplizieren.

Verwenden Sie keine Arrays, falls Sie schon wissen, was Arrays sind.
*/

import java.util.Scanner;

public class aufgabe_6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl zwischen 0 und 9999 ein:");
		int zahl = scanner.nextInt();
		scanner.close();
		
		if (zahl < 0 || zahl > 9999) {
			System.out.println(zahl + " ist nicht im Intervall [0, 9999]. Das Programm wird beendet.");
			System.exit(0);
		}
		
		int tausender = 0;
		int hunderter = 0;
		int letzte_beide = 0;
		int zehner = 0;
		int einser = 0;
		String zahlwort = "";
		
		// Erste Zahl ermitteln
		tausender = zahl / 1000;
		
		// Zweite Zahl ermitteln
		hunderter = zahl /100 % 10;
		
		// Letzte zwei Zahlen ermitteln
		letzte_beide = zahl % 100;
		
		// Dritte Zahl ermitteln
		zehner = letzte_beide / 10;
		
		// Vierte Zahl ermitteln
		einser = letzte_beide % 10;
		
		//System.out.println(tausender + " " + hunderter + " " + letzte_beide + " " + zehner + " " + einser);
		
		// Tausender ausschreiben
		switch(tausender) {
		case 0:
			break;
		case 1:
			zahlwort = "ein";
			break;
		case 2:
			zahlwort = "zwei";
			break;
		case 3:
			zahlwort = "drei";
			break;
		case 4:
			zahlwort = "vier";
			break;
		case 5:
			zahlwort = "fünf";
			break;
		case 6:
			zahlwort = "sechs";
			break;
		case 7:
			zahlwort = "sieben";
			break;
		case 8:
			zahlwort = "acht";
			break;
		case 9:
			zahlwort = "neun";
			break;
		}
		// damit es nicht überall hinzugefügt werden musste, machen wir es uns einfach und fügen generell bei allem größer Null ein "tausend" hinzu
		if (tausender > 0) {
			zahlwort = zahlwort + "tausend";
		}

		
		// Hunderter ausschreiben
		switch(hunderter) {
		case 0:
			break;
		case 1:
			zahlwort = zahlwort + "ein";
			break;
		case 2:
			zahlwort = zahlwort + "zwei";
			break;
		case 3:
			zahlwort = zahlwort + "drei";
			break;
		case 4:
			zahlwort = zahlwort + "vier";
			break;
		case 5:
			zahlwort = zahlwort + "fünf";
			break;
		case 6:
			zahlwort = zahlwort + "sechs";
			break;
		case 7:
			zahlwort = zahlwort + "sieben";
			break;
		case 8:
			zahlwort = zahlwort + "acht";
			break;
		case 9:
			zahlwort = zahlwort + "neun";
			break;
		}		
		// damit es nicht überall hinzugefügt werden musste, machen wir es uns einfach und fügen generell bei allem größer Null ein "hundert" hinzu
		if (hunderter > 0) {
			zahlwort = zahlwort + "hundert";
		}
		
		// Checken, ob sonderschreibweise im Zehnerbereich vorliegt
		if (letzte_beide < 20 && letzte_beide >= 10) {
			switch(letzte_beide) {
			// Wenn ja, dann zehner ausschreiben
			case 10:
				zahlwort = zahlwort + "zehn";
				break;
			case 11:
				zahlwort = zahlwort + "elf";
				break;
			case 12:
				zahlwort = zahlwort + "zwölf";
				break;
			case 13:
				zahlwort = zahlwort + "dreizehn";
				break;
			case 14:
				zahlwort = zahlwort + "vierzehn";
				break;
			case 15:
				zahlwort = zahlwort + "fünfzehn";
				break;
			case 16:
				zahlwort = zahlwort + "sechzehn";
				break;
			case 17:
				zahlwort = zahlwort + "siebzehn";
				break;
			case 18:
				zahlwort = zahlwort + "achtzehn";
				break;
			case 19:
				zahlwort = zahlwort + "neunzehn";
				break;
			}
		} 
		// wenn nein, dann den Einser ausschreiben 
		else {
			switch(einser) {
			case 0:
				break;
			case 1:
				// Nur wenn kein Zehner vorhanden wird, muss eins (wie in eintausendeins) geschrieben werden, andernfalls ein (wie in einundzwanzig)
				if (zehner == 0) {
					zahlwort = zahlwort + "eins";
				} else {
					zahlwort = zahlwort + "ein";
				}
				break;
			case 2:
				zahlwort = zahlwort + "zwei";
				break;
			case 3:
				zahlwort = zahlwort + "drei";
				break;
			case 4:
				zahlwort = zahlwort + "vier";
				break;
			case 5:
				zahlwort = zahlwort + "fünf";
				break;
			case 6:
				zahlwort = zahlwort + "sechs";
				break;
			case 7:
				zahlwort = zahlwort + "sieben";
				break;
			case 8:
				zahlwort = zahlwort + "acht";
				break;
			case 9:
				zahlwort = zahlwort + "neun";
				break;
			}
			
			// folgend noch etwaige Zehner hinzufügen
			if (zehner > 0) {
				zahlwort = zahlwort + "und";
			}
			switch(zehner) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				zahlwort = zahlwort + "zwanzig";
				break;
			case 3:
				zahlwort = zahlwort + "dreißig";
				break;
			case 4:
				zahlwort = zahlwort + "vierzig";
				break;
			case 5:
				zahlwort = zahlwort + "fünfzig";
				break;
			case 6:
				zahlwort = zahlwort + "sechszig";
				break;
			case 7:
				zahlwort = zahlwort + "siebzig";
				break;
			case 8:
				zahlwort = zahlwort + "achtzig";
				break;
			case 9:
				zahlwort = zahlwort + "neunzig";
				break;
			}
			
		}
		
		System.out.println(zahlwort);
	}
}
