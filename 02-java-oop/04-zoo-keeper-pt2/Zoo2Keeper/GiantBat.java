public class GiantBat extends Mammal{

    public GiantBat(int energyLevel) {
        super(energyLevel);

}

//attack three towns
    public void attackTown(){
        System.out.println("We didn't start the fire!");
        this.energyLevel -= 100;
    }
//Eat two humans
    public void eatHumans() {
        System.out.println("Needs more salt.");
        this.energyLevel += 25;

    }

//fly twice
    public void fly() {
        System.out.println("Whooooosh");
        this.energyLevel -=50;

    }

}

