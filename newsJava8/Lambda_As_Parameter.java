package newsJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class Lambda_As_Parameter {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Andy", "Michael", "Simon", "Max");
        //Lambda als Methodeparameter
        Collections.sort(names, (str1, str2) -> Integer.compare(str2.length(), str1.length()));

        //Alternative mit Lambda als Rückgabe einer Methode
        names.sort(compareByLength());
    }

    private static Comparator<? super String> compareByLength() {
        return (str1, str2) -> Integer.compare(str2.length(), str1.length());
    }
}
