package uebung_2;

/*
Schreiben Sie ein Programm, das zwei ganze Zahlen als Benutzereingabe entgegennimmt und ermittelt, ob die erste Zahl durch die zweite Zahl teilbar ist.
*/

import java.util.Scanner;

public class aufgabe_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie eine ganze Zahl ein:");
		int zahl1 = scanner.nextInt();
		System.out.println("Geben Sie eine ganze Zahl ein:");
		int zahl2 = scanner.nextInt();
		
		scanner.close();
		
		if (zahl1 % zahl2 == 0) {
			System.out.println(zahl1 + " ist durch " + zahl2 + " teilbar.");
		} else {
			System.out.println(zahl1 + " ist nicht durch " + zahl2 + " teilbar.");
		}
	}
}
