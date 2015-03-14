package UebPattern.state;

import java.awt.Color;

public class BlackState extends State1 {
    // Next state for the Black state:
    // On a push(), go to "red"
    // On a pull(), go to "green"
    public void handlePush(Context c) {
        c.setState(new RedState());
    }

    public void handlePull(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public Color getColor() {
        return (Color.black);
    }
}
