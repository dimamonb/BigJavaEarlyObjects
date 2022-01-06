package ch10.pe_12;

import java.util.ArrayList;

public class Bag {
    private ArrayList<Item> item;

    public Bag() {
        this.item = new ArrayList<>();
    }

    public void add(String itemName) {
        this.item.add(new Item(itemName,count(itemName)+1));
    }

    public int count(String itemName){
        int countIdenticals = 0;
        for(Item it: item) {
            if(it.itemName.equalsIgnoreCase(itemName)) countIdenticals++;
        }
        return countIdenticals;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "item=" + item +
                '}';
    }

    class Item {
        String itemName;
        int itemQuantity;

        public Item(String itemName, int itemQuantity) {
            this.itemName = itemName;
            this.itemQuantity = itemQuantity;
        }
    }
}
