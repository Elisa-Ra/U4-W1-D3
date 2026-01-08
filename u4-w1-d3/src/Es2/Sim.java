package Es2;

import java.util.Arrays;

public class Sim {
    // ATTRIBUTI
    private long number;
    private double credit;
    private Calls[] callList;

    // COSTRUTTORE
    public Sim(long number) {
        this.number = number;
        this.credit = 0.0;
        this.callList = new Calls[5];
    }

    // METODI
    public void printSim(Sim card) {
        System.out.println("Numero Sim:" + this.number);
        System.out.println("Credito residuo:" + this.credit);
        System.out.println("Chiamate effettuate:" + Arrays.toString(this.callList));
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        if (number > 1000000000)
            this.number = number;
        else {
            System.out.println("Il numero inserito non è valido");
        }
    }
    public void setCallList (Calls[] callList) {
        this.callList = callList
    }
    public double getCredit () {
        return credit;
    }
    public Calls []
}
