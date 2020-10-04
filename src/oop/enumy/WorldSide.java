package oop.enumy;

public enum WorldSide {
    NORTH(0), EAST(90), SOUTH(180), WEST(270);

    private int degrees;

   private WorldSide(int degrees) {
        this.degrees = degrees;
    }

    public int getDegrees() {
        return degrees;
    }
}
