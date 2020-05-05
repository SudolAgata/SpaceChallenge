public class Rocket implements SpaceShip {
    public int currentWeight;
    public int maxWeight;
    public int cost;

    // constructor for Rocket class

    public Rocket(int currentWeight, int maxWeight, int cost){
        this.currentWeight = currentWeight;
        this.maxWeight = maxWeight;
        this.cost = cost;
    }

    // methods

    public int getCurrentWeight(){
        return currentWeight;
    }

    public int getMaxWeight(){
        return maxWeight;
    }

    public int getCost(){
        return cost;
    }

    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item){
        if (((currentWeight + item.getWeight()) > maxWeight))
            return false;
        else
            return true;
    }

    public void carry(Item item){
        currentWeight += item.getWeight();

    }

}
