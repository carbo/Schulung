package UebString;

public class Receipt {
    public static void main(String[] args) {
        // Einzelpreise der Waren
        double mouse = 10.0;
        double monitor = 100.50;
        double keyboard = 30.0;
        double computer = 600.0;

        // Anzahl der Waren
        int anzMouse = 1;
        int anzMonitor = 1;
        int anzKeyboard = 2;
        int anzComputer = 1;

        // Inhalt der Brieftasche
        double brieftasche = 1000.0;

        // Summe gekaufter Waren
        double summe = 0;
        summe = summe + anzMouse * mouse;
        summe = summe + anzMonitor * monitor;
        summe = summe + anzKeyboard * keyboard;
        summe = summe + anzComputer * computer;

        if (summe > brieftasche) {
            System.out.println("Sie haben nicht genug Geld in Ihrer Brieftasche");
        } else {

            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Maus", anzMouse, mouse));
            System.out.println(String.format("%30.2f EUR", anzMouse * mouse));

            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Monitor", anzMonitor, monitor));
            System.out.println(String.format("%30.2f EUR", anzMonitor * monitor));

            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Tastatur", anzKeyboard, keyboard));
            System.out.println(String.format("%30.2f EUR", anzKeyboard * keyboard));

            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Rechner", anzComputer, computer));
            System.out.println(String.format("%30.2f EUR", anzComputer * computer));

            System.out.println("__________________________________");

            System.out.println(String.format("%-9s %20.2f EUR", "Gesamt", summe));
            System.out.println(String.format("%-9s %20.2f EUR", "Gegeben", brieftasche));
            System.out.println();
            System.out.println(String.format("%-9s %20.2f EUR", "Zurück", brieftasche - summe));
        }
    }
}