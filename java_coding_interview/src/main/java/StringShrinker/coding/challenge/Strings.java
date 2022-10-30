package main.java.StringShrinker.coding.challenge;

import java.util.HashMap;
import java.util.Map;

public final class Strings {
    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String shrink(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            // 공백은 개수를 세지 않고 그대로 복사
            if (!Character.isWhitespace(str.charAt(i))) {
            	System.out.println("str.charAt(i) => " + str.charAt(i));
                // 더 이상 처리할 문자가 없거나, 다음 문자가 현재 개수를 세고 있는 문자와 다를 때
                if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                	System.out.println("str.length() " + str.length());
                	System.out.println("i + 1 " + i + 1);
                	
                	
                    // 최종 결과에 현재 문자와 연속된 문자의 개수를 추가합니다.
                    result.append(str.charAt(i)).append(count);
                    System.out.println("result " + result);

                    // 최종 결과에 현재 문자를 기록했으므로 개수는 0으로 초기화
                    count = 0;
                }
            } else {
                result.append(str.charAt(i));
                System.out.println("2) str.charAt(i)" + str.charAt(i));
                count = 0;
            }
        }

        // 주어진 문자열보다 결과 문자열이 더 짧은 경우에만 결과 문자열을 반환
        return result.length() > str.length() ? str : result.toString();
    }
}