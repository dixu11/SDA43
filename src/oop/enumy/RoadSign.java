package oop.enumy;

public class RoadSign {

    private int x;
    private int y;
    private WorldSide worldSide;

    public RoadSign(int x, int y, WorldSide worldSide) {
        this.x = x;
        this.y = y;
        this.worldSide = worldSide;
    }

    public WorldSide getWorldSide() {
        return worldSide;
    }

    public int getDegrees() {
        return worldSide.getDegrees();
    }
}
