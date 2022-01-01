package labexam;

import java.util.ArrayList;

public class Numbers {

    /****************************************************
     *
     * Write a method that will determine if the numbers are in
     * ascending order and ignore any entry that is not a number.
     * Any symbol (letters, symbols, "-" ) are all illegal chars
     * and that entry is ignored.  No Negative numbers allowed
     * example:
     *
     * For example:
     * {"1", "2a", "3", "-4", "-3a", "-2", "-1"}  -> true;
     */

    public boolean inOrderQuestion(String[] sNums) {
        String indexes = new String();
        boolean returner = false;
        for (int count = 0; count < sNums.length; count++) {
            if (Character.isDigit(sNums[count].charAt(0))) {
                indexes += Integer.toString(count);
            }
        }
        if (indexes.length() == 1) {
            return true;
        }

            int first;
        int second;
            for (int counter = 0; counter < indexes.length() - 1; counter++) {
                try {
                    first = Integer.parseInt(sNums[Integer.parseInt(indexes.substring(counter, counter + 1))]);
                    second = Integer.parseInt(sNums[Integer.parseInt(indexes.substring(counter + 1, counter + 2))]);
                    if (first <= second) {
                        returner = true;
                    } else {
                        return false;
                    }
                }
                catch (NumberFormatException e){
                    first = Integer.parseInt(sNums[Integer.parseInt(indexes.substring(counter, counter + 1))]);
                    second = Integer.parseInt(sNums[Integer.parseInt(indexes.substring(counter + 2, counter + 3))]);
                    if (first <= second) {
                        returner = true;
                    } else {
                        return false;
                    }
                    counter+=2;
                }



            }



        return returner;
    }

}

/*************************  Answers ***************************
 * THis answer will not be included in the real exam
 public boolean inOrderQuestion(String[] sNums) {
 ArrayList<String> list = new ArrayList<String>();
 for (int i = 0; i < sNums.length; i++)
 if (isAllDigits(sNums[i]))
 list.add(sNums[i]);

 boolean inO = true;
 for (int i = 0; i < list.size() - 1; i++) {
 if (Integer.parseInt((String) list.get(i)) >
 Integer.parseInt((String) list.get(i + 1)))
 return false;
 }
 return true;
 }

 public boolean isAllDigits(String s) {
 for (int i = 0; i < s.length(); i++)
 if (!Character.isDigit(s.charAt(i)))
 return false;
 return true;
 }*/