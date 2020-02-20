package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private List<T> box;
    private float sum;

    public BoxWithFruits (T... box){
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, box);     // мож asList ?
        this.box = arrayList;
    }
    public BoxWithFruits() {
        this.box = new ArrayList<>();
    }

    private float getWeight(){
        if (box.size() == 0) {
            sum = 0.0f;
            return sum;
        }
        sum = 0.0f;
        for (T fruit : box) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    private boolean compare(BoxWithFruits<?> box2){
        if (this.getWeight() == box2.getWeight()) {
            return true;
        }   return false;
    }

    private void swapFruits (BoxWithFruits<T> box2){    // т.к. T, то мы можем из Apple -> Apple, Orange -> Orange, но не можем Apple -> Orange
        if (this == box2) {
            return;
        }
        box2.box.addAll(this.box);
        this.box.clear();
    }

    private void addFruit (T fruit) {
        this.box.add(fruit);
    }


}


