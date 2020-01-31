# EidiP
Einführung in die Programmierung 

Aufgabenblatt 08 Bearbeitungsende: 01.12.2019

Aufgabe 1 [Programmierung – nicht bewertet]
Schreiben Sie eine Klasse Zahlen mit den folgenden Klassenmethoden, die die wichtigsten arithme
tischen Ganzzahloperationen aus den Grundoperationen++, -- und - (Negation eines Wertes, nicht
Diﬀerenz zweier Werte) nachbilden. 

Das Ergebnis soll jeweils mittels einer Schleife sukzessive berechnet werden. 

Verwenden Sie dabei keine arithmetischen Operatoren außer den genannten Grundoperatoren. 
Für höhere Operationen wie Multiplikation oder Division verwenden Sie die von Ihnen erstellten 
Methoden wie Addition oder Subtraktion. 

Hinweis: Gehen Sie zunächst davon aus, dass beide Argumente nichtnegativ sind.

(a) addLoop(int a, int b) soll den Wert a+b berechnen und zurückgeben, ohne jedoch den Ope-
    rator + zu verwenden. 
    
(b) subLoop(int a, int b) soll den Wert a-b berechnen und zurückgeben, ohne jedoch den (Sub-
    traktions)Operator - zu verwenden. 
    
(c) mulLoop(int a, int b) soll den Wert a*b berechnen und zurückgeben, ohne jedoch den Ope-
    rator * zu verwenden. 
    
(d) divLoop(int a, int b) soll den Wert a/b berechnen und zurückgeben, ohne jedoch den Ope-
    rator / zu verwenden. 
    Es soll a >= 0 und b > 0 gelten, damit die Operation eindeutig deﬁniert ist. 
    
(e) modLoop(int a, int b) soll den Wert amodb berechnen und zurückgeben, ohne jedoch den 
    Operator % zu verwenden. 
    Die Voraussetzungen sind dieselben wie für divLoop.
    
(f) powLoop(int a, int b) soll den Wert ab berechnen und zurückgeben (z.B. für 3 und 2 den 
    Wert 32^2 = 9).
    Verwenden Sie nicht die Methode Math.pow. 
    Es muss bě0 gelten, damit das Ergebnis immer ganzzahlig ist. 
    0^0 sei hier 1.
    
Erweitern Sie die Methoden schließlich so, dass sie mit allen zulässigen (auch negativen) ganzzahligen 
Argumenten arbeiten. Gehen Sie davon aus, dass keine ungültigen Argumente (Division durch 0)
übergeben werden. 
Hinweis: Ggf. können Sie einen einmaligen rekursiven Aufruf verwenden.
    
