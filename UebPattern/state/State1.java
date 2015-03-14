package UebPattern.state;

import java.awt.Color;

/**
 * Abstract class which defines the interface for the behavior of a particular state of the Context.
 */
public abstract class State1 {
    public abstract void handlePush(Context c);

    public abstract void handlePull(Context c);

    public abstract Color getColor();
}
