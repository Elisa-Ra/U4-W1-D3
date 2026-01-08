package Es1;

public class Rettangolo {

    // LISTA ATTRIBUTI
    private double altezza;
    private double larghezza;

    // LISTA COSTRUTTORI
    // Sono metodi speciali che si usano esclusivamente in fase di creazione dell'oggetto, e servono principalmente per
    // inizializzare gli attributi degli oggetti in fase di creazione.

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampaRettangolo(Rettangolo r1) {
        System.out.println("Il perimetro è: " + r1.getPerimeter());
        System.out.println("L'area è: " + r1.getArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1");
        stampaRettangolo(r1);

        System.out.println("\n Rettangolo 2");
        stampaRettangolo(r2);

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


}