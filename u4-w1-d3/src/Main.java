import Es1.Rettangolo;


public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(4, 7);
        Rettangolo r2 = new Rettangolo(6, 10);
        
        r1.stampaRettangolo();
        Rettangolo.stampaDueRettangoli(r1, r2);

    }
}