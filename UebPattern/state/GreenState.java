package UebPattern.state;

import java.awt.Color;

public class GreenState extends State1 {
    // Next state for the Green state:
    // On a push(), go to "black"
    // On a pull(), go to "red"
    @Override
    public void handlePush(Context c) {
        c.setState(new YellowState());
    }

    @Override
    public void handlePull(Context c) {
        c.setState(new RedState());
    }

    @Override
    public Color getColor() {
        return (Color.green);
    }

    @Override
    public String toString() {
        return "Green";
    }
}
