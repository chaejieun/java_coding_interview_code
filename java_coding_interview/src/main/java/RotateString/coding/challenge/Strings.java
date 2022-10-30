package main.java.RotateString.coding.challenge;

import java.util.regex.Pattern;

public final class Strings {
    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }
        System.out.println(" str1 + str1 : " +  str1 + str1);
        System.out.println(" Pattern.quote(str2): " +  Pattern.quote(str2));
        System.out.println(" \"(?i).*\" + Pattern.quote(str2) + \".*\": " +  "(?i).*" + Pattern.quote(str2) + ".*");
        return (str1 + str1).matches("(?i).*" + Pattern.quote(str2) + ".*");
    }
}