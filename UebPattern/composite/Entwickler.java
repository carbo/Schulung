package UebPattern.composite;

public class Entwickler implements Mitarbeiter {

    private final String name;
    private final double gehalt;

    public Entwickler(String name, double salary) {
        this.name = name;
        this.gehalt = salary;
    }

    @Override
    public void add(Mitarbeiter employee) {
    }

    @Override
    public Mitarbeiter getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getGehalt() {
        return gehalt;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Gehalt =" + getGehalt());
        System.out.println("-------------");
    }

    @Override
    public void remove(Mitarbeiter employee) {
    }

}
