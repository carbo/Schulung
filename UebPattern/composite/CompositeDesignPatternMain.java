package UebPattern.composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Mitarbeiter emp1 = new Entwickler("Uwe", 10000);
        Mitarbeiter emp2 = new Entwickler("Dirk", 15000);
        Mitarbeiter manager1 = new Manager("Peter", 25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Mitarbeiter emp3 = new Entwickler("Michael", 20000);
        Manager generalManager = new Manager("Tim", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
