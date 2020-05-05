public class U2 extends Rocket {

    // default constructor for U2 class
    public U2(){
        super(18, 29, 120);
        // rocket weight = 18 Tonnes
        // max weight (with cargo) = 29 Tonnes
        // rocket cost = $120 Million
    }

    // chance of launch explosion = 4% * (cargo carried / cargo limit)
    public boolean launch(){
        double chance = 0.04 * ((double)super.getCurrentWeight()/super.getMaxWeight());
        double randomNumber = Math.random();
        return chance <= randomNumber;
    }

    // chance of landing crash = 8% * (cargo carried / cargo limit)
    public boolean land(){
        double chanceOfCrash = 0.08 * ((double)super.getCurrentWeight()/super.getMaxWeight());
        double randomNumber = Math.random();
        return chanceOfCrash <= randomNumber;
    }

}

