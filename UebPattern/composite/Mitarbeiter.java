package UebPattern.composite;

public interface Mitarbeiter {

    public void add(Mitarbeiter employee);

    public void remove(Mitarbeiter employee);

    public Mitarbeiter getChild(int i);

    public String getName();

    public double getGehalt();

    public void print();
}
