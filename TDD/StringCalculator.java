package TDD;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    /**
     * @param s
     * @return Integer
     * @throws RuntimeException
     */
    public int add(String s) throws RuntimeException {

        int returnValue = 0;
        if (null != s && s.equals("")) {
            return returnValue;
        }

        List<Integer> inputIntegerList = splitStringInputValue(s);

        for (Integer integer : inputIntegerList) {
            returnValue = returnValue + integer;
        }

        return returnValue;

    }

    /**
     * @param s
     * @return Integer
     * @throws RuntimeException
     */
    public int subtract(String s) throws RuntimeException {

        int returnValue = 0;

        if (null != s && s.equals("")) {
            return returnValue;
        }

        List<Integer> inputIntegerList = splitStringInputValue(s);
        for (int i = 0; i < inputIntegerList.size(); i++) {
            Integer integer = inputIntegerList.get(i);
            if (i == 0) {
                returnValue = integer;
            } else {
                returnValue = returnValue - integer;
            }

        }

        return returnValue;
    }

    /**
     * @param s
     * @return Integer
     * @throws RuntimeException
     */
    public int multiply(String s) throws RuntimeException {

        int returnValue = 1;
        if (null != s && s.equals("")) {
            return 0;
        }

        List<Integer> inputIntegerList = splitStringInputValue(s);

        for (Integer integer : inputIntegerList) {
            returnValue = returnValue * integer;
        }

        return returnValue;
    }

    /**
     * @param inputValue
     * @return Integer
     * @throws RuntimeException
     */
    public List<Integer> splitStringInputValue(String inputValue)
            throws RuntimeException {

        String stringArray[] = inputValue
                .split("[,!.?:;&?'+]");
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < stringArray.length; i++) {

            String string = stringArray[i];

            if (null != string && !string.equals("")) {
                if (isInteger(string)) {
                    list.add(Integer.parseInt(string));
                }
            }

        }

        StringBuilder negativeValue = new StringBuilder();
        for (Integer integer : list) {
            if (integer < 0)
                negativeValue.append(integer + " ");
        }

        if (!negativeValue.toString().equals("")) {
            throw new RuntimeException(
                    "Negatives not allowed. Negative values: "
                            + negativeValue.toString());
        }

        return list;
    }

    /**
     * @param inputValue
     * @return Integer
     */
    public static boolean isInteger(String inputValue) {
        try {
            Integer.parseInt(inputValue);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}