public class Item {
    private String name;
    private int weight;

    // constructor for Item class
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    // methods
    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }
}
