package oop.enumy;

public class Demo {

    public static void main(String[] args) {
        //final
        /*final int number = 10;
        final Person person = new Person("Adam", 19);*/

        RoadSign roadSign = new RoadSign(1, 2, WorldSideOldWay.NORTH);
        RoadSign roadSign2 = new RoadSign(3, 4, WorldSideOldWay.SOUTH);
        int side = roadSign2.getWorldSide();



        switch (side){
            case WorldSideOldWay.NORTH:
                System.out.println("Robi się zimniej idąc tą drogą");
                break;
            case WorldSideOldWay.SOUTH:
                System.out.println("Robi się cieplej...");
                break;
        }

    }

}
