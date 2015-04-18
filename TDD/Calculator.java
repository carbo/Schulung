package TDD;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class Calculator {
    public static int add(String s) {
        if(s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            String[] tokens = s.split(",");
            int j = 0;
            for (int i = 0; i < tokens.length; i++) {
               j+=Integer.parseInt(tokens[i]);
            }
            return j;
        } else {
            return Integer.parseInt(s);
        }
    }
}
