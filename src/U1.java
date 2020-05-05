public class U1 extends Rocket {

// default constructor for U1 class
    public U1(){
        super(10, 18, 100);
        // rocket weight = 10 Tonnes
        // max weight (with cargo) = 18 Tonnes
        // rocket cost = $100 Million
    }

    // chance of launch explosion = 5% * (cargo carried / cargo limit)
    public boolean launch(){
        double chance = 0.05 * ((double)super.getCurrentWeight()/super.getMaxWeight());
        double randomNumber = Math.random();
        return chance <= randomNumber;
    }

    // chance of landing crash = 1% * (cargo carried / cargo limit)
    public boolean land(){
        double chanceOfCrash = 0.01 * ((double)super.getCurrentWeight()/super.getMaxWeight());
        double randomNumber = Math.random();
        return chanceOfCrash <= randomNumber;
    }

}
