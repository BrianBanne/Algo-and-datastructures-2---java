# Oblig2-algdata
 
 Brian Banne, s329333
 Hans Erling Klevstad, s341872
 
 ## Kommentarer til oppgaver
 ### Oppgave 1 
 Ble løst med litt prøving og feiling, ble lettere å teste når ```toString()```-metodene var implementert.
### Oppgave 2 
a) ```toString()``` ble implementert ved å initialisere en StringBuilder og la til en ```[``` før jeg ved hjelp av en while-løkke traverserte fra hodet gjennom LenketListen
 og la til verdien i listen etterfulgt av et komma og mellomrom, for å få formateringen rett: ```sb.append(temp.verdi).append(", ");```.
 Etter alle verdien i listen er lagt til slettes det siste kommaet og space, og klammen ```]``` legges til på slutten i stedet.
 Hvis listen er tom returneres bare ```[]```.
  ```omvendtString()``` ble implementert identisk bortsett fra at løkken starter ved halen og traverserer gjennom løkken til hodet.

 b) ```leggInn()``` sjekker først at verdien som skal legges inn ikke er ```null``` ved hjelp av ```Objects.requireNonNull```
 derettes valideres indeksen ved hjelp av ```indeksKontroll(int indeks, boolean leggInn)``` metoden arvet fra ```Liste```-interfacet.
 Hvis indeksen verdien skal legges inn på er lik null, altså hodet, settes hodet lik gitt verdien. Hvis antallet er null, at listen er tom
 settes hodet lik halen. Forrige pekeren til node fremfor hodet oppdateres også slik at det peker på den nye verdien.
 Hvis verdien skal legges inn en plass mellom hodet og halen i listen itererer man ved hjelp av en for-løkke til indeks-plassen
 hvor verdien skal legges inn, og det opprettes en ny node. Pekerne til noden framfor og bak oppdateres også slik at de peker
 til den nye verdien lagt inn. Deretter oppdateres antallet i listen og endringer.   
### Oppgave 3
 ```subliste(int fra, int til)``` ble implementert på et senere tidspunkt, og gjorde nytte av eksisterende metoder 
    for å legge inn elementer. Viktig å holde tunga rett i munnen på hvilke attributter man jobbet med og kallet på, hovedlisten 
    eller sublist.
### Oppgave 4
 Grei skuring med en god gammeldags traversering, fikk til og med bruk for ternary-operatoren, brukt med måte.
### Oppgave 5
 
### Oppgave 6
Metoden fjerner det den skal men er ikke så effektiv, #romforforbedring.
 ### Oppgave 7
 Metode 1 var mest effektiv.
### Oppgave 8
Sjekker først at iteratorendringer er lik endringer, og kaster unntak hvis ikke.
### Oppgave 9
Implementerer først validering
Implementerer først "spesialtilfellene" altså hvis listen kun har et element, noden er lik hode eller hale.
Hvis listen kun har et element settes ```hode=hale=null```, hvis ```denne=null``` er det forrige elementet halen, og 
halen settes til det forrige elementet altså ```hale.forrige```, neste til den nye halen oppdateres også slik at den er lik null.
For de andre verdiene må neste pekeren til det forrige elementet oppdateres så det peker på det nye neste, og det samme
med forrige pekeren til elementet foran. Til slutt minskes ```antallet```, mens ```endringer``` og ```iteratorendringer``` økes.



### Oppgave 10
 Ikke fullstendig implementert, finner bare minste verdi
 
 
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