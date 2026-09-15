# Grundlagen des Entwicklungsansatz von Clean Code

Dabei geht es darum Quellcode so zuschreiben und zu strukturieren, dass er (für andere Personen) leicht verständlich, lesbar, wartbar und einfach zu erweitern ist.

## 1. Sprechende Benennungen

Variablen, Methoden, Klassen, usw. sollten aussagekräftige Namen bekommen, die ihre Funktion und Zweck widerspiegeln. Ihr Nutzen sollte auf einen ersten Blick erkennbar sein und nicht erst durch lange Interpretationen möglich werden.

## 2. Sinvolle Kommentare

Obwohl sich der Code im besten Fall selbst erklären sollte, sind Kommentare dennoch sinnvoll. Kommentare sollten primär nicht das Wie, sondern das Warum erläutern.
Besonders für AnfängerInnen lohnt sich ausführliches kommentieren aber ebenfalls, um sich eine genaue Funktionsweise nachhaltig zu dokumentieren.

## 3. einheitliche Formatierung und Konventionen

Skripte sollten einheitlich Formatiert sein und Benennungen einer gleichbleibenden Konvention folgen, um die Lesbarkeit zu verbessern.

## 4. Fokussierte Funktionen

Funktionen sollten möglichst kurz sein und der Lösung von genau einer Aufgabe dienen. So können sie möglichst häufig für unterschiedlichste Kontexte eingesetzt werden.

## 5. Keep it simple, Stupid (KISS-Prinzip)

Eine Lösung sollte immer über den einfachsten Weg erfolgen. Unnötige Komplexität erschwert nicht nur das Verständnis und die Wartung, sondern führt in der Regel auch zu einer schlechteren Performance der Lösung.

## 6. You aren't gonna need it (YAGNI-Prinzip)

Nach diesem Prinzip wird nur das Implementiert, was aktuell tatsächlich benötigt wird. Erweiterungen/Rücksicht auf spekulative künftige Anwendungsfälle oder ähnliches sind nicht zu beachten.
