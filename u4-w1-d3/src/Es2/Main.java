package Es2;

public class Main {
    public static void main(String[] args) {
        Sim card1 = new Sim(333033333);
        card1.printSim();
        card1.setNumber(33300333);
        card1.printSim();
        Calls chiamata1 = new Calls(1.0, 3336013310);
        Calls chiamata2 = new Calls(2.0, 3335332310);
        Calls chiamata3 = new Calls(3.0, 3033635310);
        Calls chiamata4 = new Calls(4.0, 3336373310);
        Calls chiamata5 = new Calls(5.0, 3336389010);
        Calls[] arrayOfCalls = {chiamata1, chiamata2, chiamata3, chiamata4, chiamata5};
        card1.setCallList(arrayOfCalls);
        card1.printSim();
    }
}
