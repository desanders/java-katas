import java.util.*;

/**
 * Created by desanders on 03/09/15. This completes the Multi-tap Keypad Text Entry on an Old Mobile Phone Kata detailed on www.codewars.com
 */
public class Keypad {

    public static HashMap<String, Integer> hashMap() {

        HashMap<String, Integer> hm = new HashMap();

        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",1);
        hm.put("e",2);
        hm.put("f",3);
        hm.put("g",1);
        hm.put("h",2);
        hm.put("i",3);
        hm.put("j",1);
        hm.put("k",2);
        hm.put("l",3);
        hm.put("m",1);
        hm.put("n",2);
        hm.put("o",3);
        hm.put("p",1);
        hm.put("q",2);
        hm.put("r",3);
        hm.put("s",4);
        hm.put("t",1);
        hm.put("u",2);
        hm.put("v",3);
        hm.put("w",1);
        hm.put("x",2);
        hm.put("y",3);
        hm.put("z",4);
        hm.put("0",2);
        hm.put("1",4);
        hm.put("2",4);
        hm.put("3",4);
        hm.put("4",4);
        hm.put("5",4);
        hm.put("6",4);
        hm.put("7",5);
        hm.put("8",4);
        hm.put("9",5);
        hm.put(" ",1);

        return hm;
    }

    public static int calculatePresses(String input) {

        int count = 0;

        String lowerString = input.toLowerCase();

        char[] charArray = lowerString.toCharArray();

        for (char value : charArray) {

            String stringValue = Character.toString(value);
            HashMap<String, Integer> hm = hashMap();
            count += hm.get(stringValue);

        }

        return count;

    }


}
