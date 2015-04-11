package UebPattern.observer;

public class Abonnent implements Observer1 {

    private final String name;

    public Abonnent(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject1 s) {
        System.out.println(this.name + " ist informiert worden.");
        // print job list
        System.out.println(s);
    }
}
