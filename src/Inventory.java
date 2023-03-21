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

    //Adds item to the inventory list
    //If item already exists then quantity is increased of that item instead of adding a new object
    public void add(Item item){
        boolean found = false;
        for(Item x:items){
            if(x.getName().equals(item.getName())){
                x.increaseQuantity();
                found = true;
            }
        }
        if(found==false){
            items.add(item);
        }
    }

    //Loops through inventory and adds up weight of items (NEEDS IMPLEMENTED)
    public double getWeight(){
        return -1;
    }

    //Display Inventory
    //Need to add section for each type of item class

    @Override
    public String toString() {
        String toReturn = "";
        //Food
        toReturn+="Name\tType\tQuantity\n";
        for(Item x:items){
            if(x.getClass() == Food.class){
                toReturn+=x.getName()+"\t"+((Food) x).getType()+"\t"+x.getQuantity()+"\n";
            }
        }

        return toReturn;
    }

    public ArrayList<Item> getItems(){
        return items;
    }
}
