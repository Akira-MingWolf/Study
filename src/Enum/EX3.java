package Enum;

public class EX3 {
    enum suit {
        DIAMOND, CLUB, HEART, SPADE
    }
    enum rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
        QUEEN, KING
    }
    public static void main(String []args) {
        int limit = 4;
        suit[] suits = suit.values();
        rank[] ranks = rank.values();
        for (int i = 0       ;i < limit       ;i ++       ) {
            suit s = suits[(int) (Math.random()* suits.length)];
            rank r = ranks[(int) (Math.random()* ranks.length)];
            System.out.println(r + " of " + s);
        }
    }
}
