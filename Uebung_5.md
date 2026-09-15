# Übung 5: Methoden

## Aufgaben

### Aufgabe 1

Schreiben Sie eine Methode `public static int max(int a, int b)`, die zwei Ganzzahlen entgegennimmt und die größere der beiden Zahlen zurückgibt.

---

### Aufgabe 2

Schreiben Sie eine Methode `public static int minmax(int a, int b, boolean max)`, die zwei Ganzzahlen und einen Boole'schen Wert `max` entgegennimmt und in Abhängigkeit des Wertes `max` die größere der beiden Zahlen (`max` hat den Wert `true`) oder die kleinere der beiden Zahlen (`max` hat den Wert `false`) zurückgibt.

---

### Aufgabe 3

Schreiben Sie eine Methode `public static int quersumme(int n)`, welche die Quersumme der natürlichen Zahl `n` berechnet und zurückliefert. Die Quersumme einer Zahl ist die Summe der einzelnen Ziffern.

Beispiele (das ist NICHT die Darstellung der Konsolenausgabe):

- n = 7, Quersumme = 7
- n = 247, Quersumme = 13
- n = 1000, Quersumme = 1

---

### Aufgabe 4

Schreiben Sie eine Methode `gauss`, welche eine natürliche Zahl `n` entgegennimmt und die Summe der Zahlen von 1 bis `n` zurückliefert. Verwenden Sie die Gaußsche Summenformel.

---

### Aufgabe 5

Schreiben Sie eine Methode `zahlRueckwaerts`, die eine natürliche Zahl als Parameter entgegennimmt und eine natürliche Zahl zurückliefert, welche den Parameter rückwärts enthält.

Beispiele (das ist NICHT die Darstellung der Konsolenausgabe):

- Parameter = 23, Ergebnis = 32
- Parameter = 483, Ergebnis = 384
- Parameter = 1760, Ergebnis = 671

---

### Aufgabe 6

Schreiben Sie eine Methode `public static double abstand(double x1, double y1, double x2, double y2)`, welche den geometrischen Abstand der beiden Punkte (x1, y1) und (x2, y2) zurückliefert. Der geometrische Abstand berechnet sich nach der Formel:

$$\sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$
