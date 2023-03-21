public class InventoryExample {
    public static void main(String[] args){
        Inventory inventory = new Inventory(1500);
        inventory.add(new Food(Food.Type.MEAT, "Mr. Moo", 2));
        inventory.add(new Food(Food.Type.WATER, "aqua", 10));
        System.out.println(inventory.toString());

    }
}
