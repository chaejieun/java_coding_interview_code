package main.java.ExtractIntegers.coding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Strings {
    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static List<Integer> extract(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder(String.valueOf(Integer.MAX_VALUE).length());

        System.out.println("str.length(): " + str.length());
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {  // 또는 if (((int) ch) >= 48 && ((int) ch) <= 57)
                temp.append(ch);
                System.out.println("temp: " + temp);
            } else {
                if (temp.length() > 0) {
                    result.add(Integer.parseInt(temp.toString()));
                    temp.delete(0, temp.length());
                    
                    System.out.println("result: " + result);
                }
            }
        }

        return result;
    }
}