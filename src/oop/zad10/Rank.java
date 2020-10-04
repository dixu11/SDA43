package oop.zad10;

public enum Rank {
NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

private int strength;

    Rank(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
