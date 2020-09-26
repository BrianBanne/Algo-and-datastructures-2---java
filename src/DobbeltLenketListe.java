////////////////// class DobbeltLenketListe //////////////////////////////


import javax.swing.text.Position;
import java.util.*;

import java.util.function.Predicate;



public class DobbeltLenketListe<T> implements Liste<T> {

    /**
     * Node class
     * @param <T>
     */
    private static final class Node<T> {
        private T verdi;                   // nodens verdi
        private Node<T> forrige, neste;    // pekere

        private Node(T verdi, Node<T> forrige, Node<T> neste) {
            this.verdi = verdi;
            this.forrige = forrige;
            this.neste = neste;
        }

        private Node(T verdi) {
            this(verdi, null, null);
        }
    }
    private Node<T> finnNode(int indeks) {
        Node current;
        if (indeks < antall/2) {
            current = hode;
            for (int i = 0; i < indeks; i++) {
                current = current.neste;
            }
        } else {
            current = hale;
            for (int i = antall; i < indeks; i--) {
                current = current.forrige;
            }
        }
        return current;
    }

    // instansvariabler
    private Node<T> hode;          // peker til den første i listen
    private Node<T> hale;          // peker til den siste i listen
    private int antall;            // antall noder i listen
    private int endringer;         // antall endringer i listen

    public DobbeltLenketListe() {

    }

    public DobbeltLenketListe(T[] a) {
        Objects.requireNonNull(a, "Tabellen a er null!!");
        if (a.length == 0){
            hode = hale = new Node<T>(null);
            return;
        }

        for (T t : a) {
            if (t == null) continue;
            if (tom()) hode = hale = new Node<T>(t);

            else {
                Node<T> temp = hale;
                hale = new Node<>(t, temp, null);
                temp.neste = hale;

            }
            antall++;
        }

    }

    public Liste<T> subliste(int fra, int til){
        throw new UnsupportedOperationException();
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean tom() {
        return antall == 0;
    }

    @Override
    public boolean leggInn(T verdi) {
        Objects.requireNonNull(verdi, "Ugyldig verdi");
        if (tom()) {
            hode = hale = new Node<T>(verdi);
        } else  {
            Node<T> temp = hale;
            hale = new Node<>(verdi, temp, null);
            temp.neste = hale;
        }
        antall++;
        endringer++;
        return true;
    }

    @Override
    public void leggInn(int indeks, T verdi) {
        Objects.requireNonNull(verdi, "Ugyldig verdi");
        indeksKontroll(indeks, true);

        if (indeks == 0){
           hode = new Node<T>(verdi, null, hode);
            if (antall == 0) hale = hode;
            else hode.neste.forrige = hode;

        } else if (indeks == antall){
            hale = hale.neste = new Node<T>(verdi, hale, null);
        } else {
            Node<T> current = hode;
            for (int i = 1; i < indeks; i++){
                current = current.neste;
            }
            Node<T> nyNode = new Node<T>(verdi, current, current.neste);
            current.neste.forrige = nyNode;
            current.neste = nyNode;
        }
        antall++;
        endringer++;
    }

    @Override
    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;
    }

    @Override
    public T hent(int indeks) {
        Node<T> RiktigNode;
        indeksKontroll(indeks, false);
        RiktigNode = finnNode(indeks);

        return (T) RiktigNode; // metoden skal returnere et tall ifølge testen
                                // finner ingen måte å få dette til enda

    }

    @Override
    public int indeksTil(T verdi) {
        boolean inneholderVerdi = false;
        int indeks = 0;
        Node<T> temp = hode;
        while(temp != null){
            if (temp.verdi.equals(verdi)){
                inneholderVerdi = true;
                break;
            }
            temp = temp.neste;
            indeks++;
        }
        return inneholderVerdi ?  indeks : -1;
    }

    @Override
    public T oppdater(int indeks, T nyverdi) {
        indeksKontroll(indeks, false);
        int temp = indeks;
        endringer++;
        return nyverdi; //skal returnere indeks, men også en Node??
    }

    @Override
    public boolean fjern(T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T fjern(int indeks) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nullstill() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node temp = hode;;
        while (temp != null){
            sb.append(temp.verdi).append(", ");
            temp = temp.neste;
        }
        if (!tom()) sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public String omvendtString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node temp = hale;;
        while (temp != null){
            sb.append(temp.verdi).append(", ");
            temp = temp.forrige;
        }
        if (!tom()) sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();

    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public Iterator<T> iterator(int indeks) {
        throw new UnsupportedOperationException();
    }

    private class DobbeltLenketListeIterator implements Iterator<T>
    {
        private Node<T> denne;
        private boolean fjernOK;
        private int iteratorendringer;

        private DobbeltLenketListeIterator(){
            denne = hode;     // p starter på den første i listen
            fjernOK = false;  // blir sann når next() kalles
            iteratorendringer = endringer;  // teller endringer
        }

        private DobbeltLenketListeIterator(int indeks){
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean hasNext(){
            return denne != null;
        }

        @Override
        public T next(){
            throw new UnsupportedOperationException();
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }

    } // class DobbeltLenketListeIterator

    public static <T> void sorter(Liste<T> liste, Comparator<? super T> c) {
        throw new UnsupportedOperationException();
    }

} // class DobbeltLenketListe


