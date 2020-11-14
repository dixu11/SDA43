package oop.garden;

public class GardenDemo {

    public static void main(String[] args) {
        Tree tree1 = new Tree(3,1);
        Tree tree2 = new Tree(3.2,2);
        Tree tree3 = new Tree(4.1,3);
        Bench bench1 = new Bench(3, "wooden");
        Bench bench2 = new Bench(2, "steel");
        Garden garden = new Garden(bench1,bench2);
        System.out.println(garden);
        garden.addTree(tree1);
        garden.addTree(tree2);
        garden.addTree(tree3);
        garden.growAllTrees();

        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();
        garden.sitOnFreeBench();

    }
}
