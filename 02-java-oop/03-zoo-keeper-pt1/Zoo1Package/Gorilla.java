public class Gorilla extends Mammal{
    
    public Gorilla(int energyLevel){
        super(energyLevel);
    }
    //throw minus 5
    public void throwSomething(){
        System.out.println("The gorilla is throwing stuff!");
        this.energyLevel -= 5;
    }
    //eat plus 10
    public void eatBanana(){
        System.out.println("Gorilla eat banana for energy!");
        this.energyLevel += 10;
    }
    //climb minus 10
    public void climbTree(){
        System.out.println("Gorilla getting tired from climbing trees all day!");
        this.energyLevel -= 5;
    }
}
