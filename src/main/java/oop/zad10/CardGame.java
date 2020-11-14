package oop.zad10;

public class CardGame {


    public int compareCards(Card card1, Card card2) {
        if (card1.getStrength() > card2.getStrength()) {
            System.out.println("Silniejsza: " + card1);
            return 1;
        } else if (card1.getStrength() < card2.getStrength()) {
            System.out.println("Silniejsza: " + card2);
            return -1;
        } else {
            System.out.println("Remis");
            return 0;
        }
    }


}
