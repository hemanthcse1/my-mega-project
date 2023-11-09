package com.hemanth.problemsolving.dynamicProgramming;

public class CoinChangeLeetcode322 {

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {

        if (amount < 1) {
            return 0;
        }

        int[] coinMemo = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            coinMemo[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && coinMemo[i - coin] != Integer.MAX_VALUE) {
                    coinMemo[i] = Math.min(coinMemo[i], 1 + coinMemo[i - coin]);
                }
            }
        }

       if (coinMemo[amount] == Integer.MAX_VALUE){
           return -1;
       }

        return coinMemo[amount];
    }
}
