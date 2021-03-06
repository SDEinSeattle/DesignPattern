package DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item i: items) {
            cost += i.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item i: items) {
            System.out.println("Item : " + i.name() + ", Packing: " + i.packing().pack() + ", Price: " + i.price());
        }
    }
}
