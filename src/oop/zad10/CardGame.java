package oop.zad10;

public class CardGame {


    public void compareCards(Card card1, Card card2) {
        if (card1.getStrength() > card2.getStrength()) {
            System.out.println("Silniejsza:" + card1);
        }
    }


}
