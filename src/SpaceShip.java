public interface SpaceShip {

    // method that returns true if the launch was successful or false if the rocket has crushed
    public  boolean launch();

    // method that returns true if the landing was successful or false if the rocket has crashed
    public boolean land();

    // method that returns true if the rocket can carry such item or false if it will exceed the weight limit
    public boolean canCarry(Item item);

    // method that update the current weight of the rocket
    public void carry(Item item);

}
