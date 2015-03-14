package UebPattern.decorator;

public class DecoratorDesignPatternMain {

    public static void main(String args[]) {
        Room room = new CurtainDecorator(new ColorDecorator(new SimpleRoom()));
        System.out.println(room.showRoom());
    }
}
