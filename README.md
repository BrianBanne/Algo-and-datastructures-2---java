# Oblig2-algdata
 
 Brian Banne, s329333
 Hans Erling Klevstad, s341872
 
 
 ## Warnings
 
 * Metoden public DobbeltLenketListe(T[] a) kaster et avvik om parameteret a 
 er null, og det skal den jo gjennom requireNonNull
 * I metoden sorter blir ingen av parameterene brukt ettersom vi ikke har gjort oppgave 9 eller 10
 * Metoden public boolean leggInn(T verdi) kaster et avvik om verdi er null og det skal den gjennom requireNonNull
 * Metoden public void leggInn(int indeks, T verdi) kaster et avvik om verdi er null og det skal den gjennom requireNonNull
 * Metoden public T oppdater(int indeks, T nyverdi) kaster et avvik om nyverdi er null og det skal den gjennom requireNonNull
 * Private boolean fjernOK er gitt en verdi, men blir ikke brukt stemmer ikke. Tror det kan være fordi vi ikke har et getter og setter, men de andre variablene gir ikke samme feilmelding??
 
