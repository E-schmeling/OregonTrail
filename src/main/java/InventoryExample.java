public class InventoryExample {
    public static void main(String[] args){
        Inventory inventory = new Inventory(1500);

        //Syntax for adding items to the inventory of the user

        Item item = new Food(Food.Type.MEAT, "Mr. Moo", 2);

        //If adding existing item object
        inventory.add(item);

        //If simply adding item to the list that doesn't exist yet
        inventory.add(new Food(Food.Type.MEAT, "Mr. Moo", 2));
        inventory.add(new Food(Food.Type.WATER, "aqua", 10));
        inventory.add(new Food(Food.Type.WATER, "aqua", 10));
        inventory.add(new Food(Food.Type.WATER, "aqua", 10));
        inventory.add(new Food(Food.Type.WATER, "aqua", 10));
        inventory.add(new Food(Food.Type.WATER, "aqua", 10));

        //Should output 5 aqua and 2 Mr. Moo
        System.out.println(inventory);


        //Creates a new store
        Store store = new Store("Trader Bob's", inventory);
            //Prints out store's inventory for user
            System.out.println(store);

            store.purchase(2, 4);

            System.out.println("\n\n"+inventory);
            System.out.println(store);







    }


}
