# Oblig2-algdata
 
 Brian Banne, s329333
 Hans Erling Klevstad, s341872
 
 ## Kommentarer til oppgaver
 ### Oppgave 1 
 Setter opp antall() til å returnere antall og boolean tom() til å returnere antall  = 0.
 Legger inn requireNonNull for å sjekke tabellen finnes. Hvis lengden er 0 setter vi hode og hale til null. Looper så gjennom alle elementene i arrayet. setter opp spesialhåndtering hvis et element er null. og hvis listen er tom så går hode og hale til samme node. Setter opp en temp til halenoden. Så gjør vi om halenoden til en ny node med t som verdi, temp til forrige og neste til null. tar deretter temp.neste til hale for å sette opp lenken riktig. 
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
    eller sublist. Lage en midlertidig node, sjekke om indeks er under eller over halvparten for å så konvertere tempen om til hode eller hale. lage 2 løkker for looping fremover hvis temp = hode og bakover hvis temp = hale. Returnerer noden, når riktig indeks er funnet. henter noden etter indekskontroll i hent og returnerer verdien. Oppdaterer listen ved å lage en ny node med nyverdi Lager en ny lenketliste, sjekker fraTilKontroll, looper gjennom det gitte intervallet med fra og til. Gir hver verdi i intervallet en egen node for å kunne legge de til i sublisten
### Oppgave 4
 Grei skuring med en god gammeldags traversering, fikk til og med bruk for ternary-operatoren, brukt med måte. Oppretter en boolean verdi. lager en temp node til hodeplassen for å loope fra venstre side. en While løkke for å sjekke om den midlertidige noden ikke er null. legger til en if metode som skal finne når temp sin verdi = T verdi. returnerer true hvis funnet og bryter ut av if løkken. Oppdaterer indeks og returnerer den gitte indeksen/posisjonen eller -1 hvis ikke funnet. boolean inneholder returnerer indeksTil hvis den ikke er -1.
### Oppgave 5
 Sjekker om både verdi og indeks er gyldige. Sjekker hvilken posisjon indeksen har for å kunne sette opp riktige handlinger. hvis indeks = 0, så opprette en ny node på hodets plass. indeks = antall, ny node på halens plass. Mellom to verdier så må loope gjennom hele listen til vi finner vår posisjon. Lager en ny node som bruker loopenodens posisjon til neste- og forrigepekere. Setter nestepeker til den nye noden, og neste.forrige til nynode.
### Oppgave 6
Tar en indekskontroll.  Hvis indeksen er 0 så blir verdien hodets verdi. setter opp hjelpenoder slik at vi har nestepekere, så finne den forrige noden til den gitte indeksen. sjekker om indeksNoden er på halen for å kunne sette opp riktige neste- og forrigepekere. hvis ikke lager vi enda en ny node mellom de 2 hjelpenodene for å kunne sette neste og forrigepekere vekk fra noden vi vil fjerne. Sjekker om verdien er null. Setter temp til listens hode. looper gjennom listen for å finne gitt node med gitt verdi. setter opp tilfeller hvis noden har hode eller haleplass. setter opp pekere slik at gitt node blir tatt ut av listen.
 ### Oppgave 7
 Metode 1
 Startet med å loope gjennom listen med en for løkke, startet på posisjon 1. setter hode.verdi = null og hode.forrige = null før vi setter hode = hode.neste.
Metode 2
setter opp en while løkke som sjekker når tom() ikke er sann for å så bruke fjernmetoden til å fjerne alle nodene helt til listen er tom. Vi fant ut at den første metoden var raskere. Det er fordi å kalle på metoder så mange ganger bruker lengre tid. 
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
 Ikke fullstendig implementert, finner bare minste verdi.
Sjekker om listen er tom. Setter opp en ny iterator og en minsteverdi til iterator.next()
Looper gjennom iteratoren og setter verdi til iterator.next() og sammenligner verdiene for å finne minste 
 
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
