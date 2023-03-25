import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<StoreItem> storeItems;

    private Inventory inventory;

    public Store(String name, Inventory inventory){
        this.name=name;
        this.inventory = inventory;
        storeItems = new ArrayList<StoreItem>();
        storeItems.add(new StoreItem(new Food(Food.Type.WATER, "Water", 2), 4, 24.50));
        storeItems.add(new StoreItem(new Food(Food.Type.MEAT, "Steak", 8), 1, 43));
        storeItems.add(new StoreItem(new Food(Food.Type.STARCH, "Flour", 5), 2, 10.35));

    }

    public void purchase(int number, int quantity){
        if(inventory.getDollars()>=(storeItems.get(number-1).getCost()*quantity)&&quantity>=storeItems.get(number-1).getQuantity()){
            inventory.takeDollars(storeItems.get(number-1).getCost()*quantity);
            for(int i = 0; i<quantity; i++){
                inventory.add(storeItems.get(number-1).getItem());
                storeItems.get(number-1).lowerQuantity(1);
            }
        }
    }

    public void addItem(StoreItem item){
        storeItems.add(item);
    }

    @Override
    public String toString() {
        String toReturn = "Option #:\tItem:\t\t\tPrice:\t\tQuantity Available\n";
        int itemNumber = 1;
        for(StoreItem i:storeItems){
            if(i.getQuantity()>0){
                toReturn+=itemNumber+".\t\t\t"+i.getItem().getName()+"\t\t\t$"+i.getCost()+"\t\t"+i.getQuantity()+"\n";
                itemNumber++;
            }
        }
        return toReturn;
    }
}
