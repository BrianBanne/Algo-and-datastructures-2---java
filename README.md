# Oblig2-algdata
 
 Brian Banne, s329333
 Hans Erling Klevstad, s341872
 
 ## Kommentarer til oppgaver
 1. Ble løst med litt prøving og feiling, ble lettere å teste når ```toString()```-metodene var implementert.
 2. ```toString()```-metodene krevde litt tenking for å få komma og klammer på rett plass. 
 3. ```subliste(int fra, int til)``` ble implementert på et senere tidspunkt, og gjorde nytte av eksisterende metoder 
    for å legge inn elementer. Viktig å holde tunga rett i munnen på hvilke attributter man jobbet med og kallet på, hovedlisten 
    eller sublist.
 4. Grei skuring med en god gammeldags traversering, fikk til og med bruk for ternary-operatoren, brukt med måte.
 5. 
 6. Metoden fjerner det den skal men er ikke så effektiv, #romforforbedring.
 7. Metode 1 var mest effektiv.
 8. Mye enkel og uskyldig initalisering og plotting.
 9. Litt trøbling med pekerne
 10. Ikke fullstendig implementert, finner bare minste verdi
 
 
 ## Testing
 Alle oppgaver unntatt oppg. 10 passerer testene.
 Noen avvik på oppgave 6 pga. ueffektiv metode
 
 ## Warnings
* Metodene 
 ```public boolean leggInn(T verdi)```,  ```public boolean leggInn(int indeks, T verdi)```,
 ```public T oppdater(int indeks, T nyverdi)```  og konstruktøren
 ```public DobbeltLenketListe(T[] a)``` 
 gir advarsel om at ``` Objects.requireNonNull``` kaster avvik hvis gitt argument er null, og det skal den.
 Derfor kan vi se bort fra disse advarslene Intellij gir oss.
 Eller har klassen ingen andre warnings.