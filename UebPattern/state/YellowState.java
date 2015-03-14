package UebPattern.state;

import java.awt.Color;

public class YellowState extends State1 {
    // Next state for the Black state:
    // On a push(), go to "red"
    // On a pull(), go to "green"
    @Override
    public void handlePush(Context c) {
        c.setState(new RedState());
    }

    @Override
    public void handlePull(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public Color getColor() {
        return (Color.yellow);
    }

    @Override
    public String toString() {
        return "Yellow";
    }
}
