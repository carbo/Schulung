package newsJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class Comparator_At_7 {
    public static void main(String[] args) {
        String str1 = "Lang";
        String str2 = "GanzLang";
        String str3 = "GanzGanzLang";
        List<String> list = new ArrayList<String>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        System.out.println(list);
        Collections.sort(list, new Comparator_At_7().compareByLength);
        System.out.println(list);

    }
    Comparator<String> compareByLength = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o2.length(), o1.length());
        }
    };

}
