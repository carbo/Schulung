package newsJava8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class InterneIteratoren {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Andy", "Michael", "Simon", "Max");
        names.forEach((String name) -> {System.out.println(name);});
        names.forEach(name -> System.out.println(name));
        names.forEach((String name) -> {System.out.println(name);});
    }
}
