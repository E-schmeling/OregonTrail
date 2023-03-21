public class Item {

    //Does not impact anything other than display text
    private String name;
    private int quantity;
    //Item weight in pounds
    private double weight;
    public Item(){
        name = "UNDEFINED ITEM NAME";
        weight = -1;
        quantity = 0;
    }

    public Item(String name, double weight){
        this.name = name;
        this.weight = weight;
        quantity = 0;
    }

    @Override
    public String toString() {
        return name + "\t" +"weight- "+ weight;
    }
}
