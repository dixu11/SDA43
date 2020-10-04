package oop.enumy;

public class RoadSign {

    private int x;
    private int y;
    private int worldSide;

    public RoadSign(int x, int y, int worldSide) {
        this.x = x;
        this.y = y;
        this.worldSide = worldSide;
    }

    public int getWorldSide() {
        return worldSide;
    }
}
