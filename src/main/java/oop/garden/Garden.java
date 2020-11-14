package oop.garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private Bench bench;
    private Bench bench2;
    private List<Tree> trees = new ArrayList<>();


    public Garden(Bench bench, Bench bench2) {
        this.bench = bench;
        this.bench2 = bench2;
    }

    public void growAllTrees() {
        for (Tree tree : trees) {
            tree.grow();
        }
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void sitOnFreeBench() {
        System.out.println("Próba siadania");
        boolean sitSuccesed = bench.sitOnBench();
        if (sitSuccesed) {
            System.out.println("Siedzisz na ławce: " + bench);
        } else if (bench2.sitOnBench()) {
            System.out.println("Siedzisz na ławce: " + bench2);
        } else {
            System.out.println("Wszystkie ławki zajęte");
        }
    }


    @Override
    public String toString() {
        return "Garden{" +
                "bench=" + bench +
                ", trees=" + trees +
                '}';
    }
}
