package main.java.Coins.coding.challenge;

import java.awt.Point;
import java.util.Set;



public final class Coins {
	private Coins() {
		throw new AssertionError("Cannot be instantiated");
	}
	
	public static int calculateChange(int n) {
		if ( n <= 0) {
			return -1;
		}
		
		int [] coins = {25, 10, 5, 1 };
		return calculateChange(n,coins, 0);
		
	}
	// 일반 재귀 알고리즘
    private static int calculateChange(int amount, int[] coins, int position) {
        if (position >= coins.length - 1) {
            return 1;
        }

        int coin = coins[position];
        int count = 0;
        for (int i = 0; i * coin <= amount; i++) {
            int remaining = amount - i * coin;
            count += calculateChange(remaining, coins, position + 1);
        }
        return count;
    }
}