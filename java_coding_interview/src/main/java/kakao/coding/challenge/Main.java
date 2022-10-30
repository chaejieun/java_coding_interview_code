package main.java.kakao.coding.challenge;

public class Main {
   public static void main(String[] args){
        Solution sol = new Solution();
        
        String [] survey = {"AN","CF","MJ","RT","NA"};	// 선택지 배열
        int [] choices  = {5,3,2,7,5}; // 점수 배열
        
        
        System.out.println(sol.solution(survey,choices));
        
    }
}