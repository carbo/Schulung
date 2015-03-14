package UebPattern.state;

import java.awt.Color;

public class RedState extends State1 {
    // Next state for the Black state:
    // On a push(), go to "green"
    // On a pull(), go to "yellow"
    @Override
    public void handlePush(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public void handlePull(Context c) {
        c.setState(new YellowState());
    }

    @Override
    public Color getColor() {
        return (Color.red);
    }

    @Override
    public String toString() {
        return "Red";
    }

}
