package oop.zad10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardsDemo {

    public static void main(String[] args) {
        Card card1 = new Card(Rank.ACE,Suit.HEARTS);
        Card card2 = new Card(Rank.QUEEN, Suit.SPADES);

        System.out.println(card1);
        System.out.println(card2);

        for (Rank rank : Rank.values()) {
            System.out.println(rank);
        }

        CardGame cardGame = new CardGame();
        cardGame.compareCards(card1,card2);

        List<Card> cards = new ArrayList<>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }

        System.out.println(cards.size());
        Collections.shuffle(cards);
        System.out.println(cards);
    }
}


/*
* Stwórz obiekt typu Karta (Card). Kartę będą opisywać dwa pola klas enumowych Rank(Ranga np. dziewiątka, as)
*  oraz Suit (Kolor - np. pik).
Stwórz dwie dowolne karty w mainie, różniące się rangą i kolorem, zaprezentuj je wykorzystując nadpisaną metodę
*  toString.
*
W mainie wyświetl wszystkie możliwe rangi wykorzystując statyczną metodę enumów - values().
*
Każda z rang ma mieć przypisaną siłę, dla dwójki 2, trójki 3 itd.
Obiekty kart mają mieć metodę pozwalającą na pobranie siły karty. Stwórz dodatkowy serwis pozwalający porównać
*  dwie karty, drukujący tą która jest większa i zwracający ją.
*
Stwórz listę wszystkich możliwych rang w kolorze pik. (wykorzystaj pętle dla automatyzacji zadania)
Stwórz całą talię, czyli listę wszystkich możliwych rang dla wszystkich możliwych kolorów.


* */
