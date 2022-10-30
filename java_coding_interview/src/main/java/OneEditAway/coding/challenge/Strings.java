package main.java.OneEditAway.coding.challenge;

import java.util.HashMap;
import java.util.Map;

public final class Strings {
    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static boolean isOneEditAway(String q, String p) {
        if (q == null || p == null  || q.isEmpty() || p.isEmpty()) {
            return false;
        }

        // 문자열 사이의 차이점이 2개 이상이면 두 번 이상의 수정이 필요
        // Math.abs => 절대값 구하기
        if (Math.abs(q.length() - p.length()) > 1) {
            return false;
        }

        // q와 p의 길이를 비교하여 더 짧은 문자열을 정합니다.
        String shorter = q.length() < p.length() ? q : p;
        String longer = q.length() < p.length() ? p : q;
        
        System.out.println("shorter: " + shorter);
        System.out.println("longer: " + longer);
        
        int is = 0;
        int il = 0;
        boolean marker = false;
        while (is < shorter.length() && il < longer.length()) {
        	 System.out.println("is : " + is);
             System.out.println("il : " + il);
            if (shorter.charAt(is) != longer.charAt(il)) {
            	
            	 System.out.println("shorter.charAt(is) : " + shorter.charAt(is) );
                 System.out.println("longer.charAt(il): " + longer.charAt(il));
                 
                // 첫 번째 차이점을 이미 발견한 상태에서 두 번째
                // 차이점을 발견했다면 false를 반환합니다.
                if (marker) {
                    return false;
                }

                marker = true;

                if (shorter.length() == longer.length()) {
                    is++;
                    System.out.println(" 2) is : " + is);
                }
            } else {
                is++;
                System.out.println(" 3) is : " + is);
            }
            il++;
            System.out.println(" 2) il : " + il);
        }

        return true;
    }
}