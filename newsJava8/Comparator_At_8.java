package newsJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class Comparator_At_8 {
    public static void main(String[] args) {
        String str1 = "Lang";
        String str2 = "GanzLang";
        String str3 = "GanzGanzLang";
        List<String> list = new ArrayList<String>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        System.out.println(list);
        Collections.sort(list, new Comparator_At_8().compareByLength);
        System.out.println(list);

    }
    Comparator<String> compareByLength = (final String o1, final String o2) ->
    {
        return Integer.compare(o2.length(), o1.length());
    };

    Comparator<String> compareByLengthOhneTyp = (o1, o2) ->
    {
        return Integer.compare(o2.length(), o1.length());
    };
}
