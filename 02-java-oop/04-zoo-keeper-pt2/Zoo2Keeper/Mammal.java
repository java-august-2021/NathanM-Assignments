public class Mammal {
    protected int energyLevel;  //protected modifier because Gorilla inherits attributes of Mammal
                                //protected modifier attributed visible on all child classes ie GiantBat
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public int displayEnergy(){
        System.out.println("Current Energy Level is: " + this.energyLevel);
        return this.energyLevel;
    }

}