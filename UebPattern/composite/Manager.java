package UebPattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Mitarbeiter {

    private final String name;
    private final double gehalt;

    public Manager(String name, double salary) {
        this.name = name;
        this.gehalt = salary;
    }

    List<Mitarbeiter> employees = new ArrayList<Mitarbeiter>();

    @Override
    public void add(Mitarbeiter employee) {
        employees.add(employee);
    }

    @Override
    public Mitarbeiter getChild(int i) {
        return employees.get(i);
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

        Iterator<Mitarbeiter> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Mitarbeiter employee = employeeIterator.next();
            employee.print();
        }
    }

    @Override
    public void remove(Mitarbeiter employee) {
        employees.remove(employee);
    }

}
