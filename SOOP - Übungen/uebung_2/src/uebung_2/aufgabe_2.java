package uebung_2;

/*
Schreiben Sie ein Programm, das eine ganze Zahl als Benutzereingabe entgegennimmt und ausgibt, ob die Zahl durch 3 teilbar ist.
*/

import java.util.Scanner;

public class aufgabe_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welche Zahl soll geprüft werden?");
		int zahl = scanner.nextInt();

		scanner.close();

		if (zahl % 3 == 0) {
			System.out.println(zahl + " ist durch 3 teilbar.");
		} else {
			System.out.println(zahl + " ist nicht durch 3 teilbar.");
		}
	}
}
