package newsJava8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class ExterneIteratoren {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Andy", "Michael", "Simon", "Max");
        final Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }

        //JDK 5 Schreibweise for-each
        for (String name : names) {
            System.out.println(name);
        }

    }
}
