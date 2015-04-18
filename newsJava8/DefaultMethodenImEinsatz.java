package newsJava8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class DefaultMethodenImEinsatz {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Andy", "Michael", "Simon", "Max");
        names.sort((str1, str2) -> Integer.compare(str2.length(), str1.length()));
        names.forEach(it -> System.out.println(it.length()+ ","));
    }
}
