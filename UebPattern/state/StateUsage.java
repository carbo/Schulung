package UebPattern.state;

public class StateUsage {
    public static void main(String[] args) {
        Context context1 = new Context();
        context1.setState(new GreenState());
        State1 state1 = context1.getState();
        context1.push();
        State1 state2 = context1.getState();
        context1.push();
        State1 state3 = context1.getState();
        System.out.println(state1 + " -> " + state2 + " -> " + state3);
    }

}
