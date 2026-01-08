package Es1;

public class Rettangolo {

    // LISTA ATTRIBUTI
    public double altezza;
    public double larghezza;

    // LISTA COSTRUTTORI
    // Sono metodi speciali che si usano esclusivamente in fase di creazione dell'oggetto, e servono principalmente per
    // inizializzare gli attributi degli oggetti in fase di creazione.


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1");
        r1.stampaRettangolo();

        System.out.println("\n Rettangolo 2");
        r2.stampaRettangolo();

        double sommaAree = r1.getArea() + r2.getArea();
        double sommaPerimetri = r1.getPerimeter() + r2.getPerimeter();

        System.out.println("La somma delle aree è: " + sommaAree);
        System.out.println("La somma dei perimetri è: " + sommaPerimetri);
    }

    // LISTA METODI
    public double getPerimeter() {
        return 2 * (this.altezza + this.larghezza);
    }

    public double getArea() {
        return this.altezza * this.larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("Il perimetro è: " + this.getPerimeter());
        System.out.println("L'area è: " + this.getArea());
    }

}