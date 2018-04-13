/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class TheBiddingGame {
    public int calculate_bid(int player, int pos, int[] first_moves, int[] second_moves) {
        int opponent = (player == 1) ? 2 : 1;
        int[] myMoves = first_moves;
        int[] hisMoves = second_moves;

        if (opponent == 1) {
            myMoves = second_moves;
            hisMoves = first_moves;
        }

        int myMoney = calculateMoney(player, myMoves, hisMoves);
        int hisMoney = calculateMoney(opponent, hisMoves, myMoves);

        int myPosition = (player == 1) ? pos : 10 - pos;
        int myOptimalBid = myMoney / myPosition;
        int advantage = calculateAdvantage(first_moves, second_moves);
        boolean firstBid = myMoney == 100 && hisMoney == 100;
        int bid = 1;

        if(firstBid) bid = (player == advantage) ? 14 : 15;
        else if (myMoney <= hisMoney / 2) bid = 1; //don't spend much
        else if ((myMoney / 2) >= hisMoney) bid = hisMoney; // we have enough to outbid him
        else bid = myOptimalBid; // optimal bid

        return Math.max(Math.min(bid, myMoney), 1);
    }

    private static int calculateAdvantage(int[] moves1, int[] moves2) {
        int advantage = 1;
        for (int i = 0; (i < moves1.length) && (moves1[i] > 0); i++) {
            if (moves1[i] == moves2[i]) {
                advantage = (advantage == 1) ? 2 : 1;
            }
        }
        return advantage;
    }

    private static int calculateMoney(int player, int[] moves1, int[] moves2) {
        int money = 100;
        int advantage = 1;
        for (int i = 0; (i < moves1.length) && (moves1[i]> 0); i++) {
            if (moves1[i] > moves2[i]) {
                money -= moves1[i];
            } else if (moves1[i] == moves2[i]) {
                if (advantage == player) {
                    money -= moves1[i];
                }
                advantage = (advantage == 1) ? 2 : 1;
            }
        }
        return money;
    }
}
