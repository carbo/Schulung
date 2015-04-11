package newsJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class Comparator_Before_7  {
    public static void main(String[] args) {
        String str1 = "Lang";
        String str2 = "GanzLang";
        String str3 = "GanzGanzLang";
        List<String> list = new ArrayList<String>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        System.out.println(list);
        Collections.sort(list, new Comparator_Before_7().compareByLength);
        System.out.println(list);

    }
    Comparator<String> compareByLength = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            final int length1 = o1.length();
            final int length2 = o2.length();
            if(length1 < length2)
                return 1;
            if(length1 > length2)
                return -1;

            return 0;
        }
    };
}
