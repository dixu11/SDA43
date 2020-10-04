package oop.enumy;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        //final
        /*final int number = 10;
        final Person person = new Person("Adam", 19);*/

        RoadSign roadSign = new RoadSign(1, 2, WorldSide.WEST);
        RoadSign roadSign2 = new RoadSign(3, 4, WorldSide.SOUTH);
        WorldSide side = roadSign2.getWorldSide();

        System.out.println(roadSign.getDegrees());

        List<WorldSide> sides = new ArrayList<>();
        sides.add(WorldSide.EAST);
        sides.add(WorldSide.WEST);
        System.out.println(sides);

        WorldSide[] values = WorldSide.values();
        for (WorldSide value : values) {
            System.out.println(value);
        }


        switch (side){
            case NORTH:
                System.out.println("Robi się zimniej idąc tą drogą");
                break;
            case EAST:
                break;
            case SOUTH:
                System.out.println("Robi się cieplej...");
                break;
            case WEST:
                break;
        }




    }

}
