

import java.util.ArrayList;

public class Inventory {
    //Stores all items for game
    private ArrayList<Item> items;
    //Stores group's money
    private double dollars;

    public Inventory(double dollars){
        items = new ArrayList<>();
        this.dollars = dollars;
    }

    public void add(Item item){
        items.add(item);
    }

    //Loops through inventory and adds up weight of items
    public double getWeight(){
        return -1;
    }

    //Display Inventory (TEMPORARY VERSION)

    @Override
    public String toString() {
        String toReturn = "";
        for(Item x:items){
            toReturn+=(x.toString())+"\n";
        }
        return toReturn;
    }
}
