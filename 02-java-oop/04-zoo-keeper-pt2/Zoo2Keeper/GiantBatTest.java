public class GiantBatTest {

    public static void main(String[] args) {
        GiantBat dracula = new GiantBat(300);

        //attack 3 towns
        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();

        //eat 2 humans
        dracula.eatHumans();
        dracula.eatHumans();

        //fly twice
        dracula.fly();
        dracula.fly();

        //displayEnergy
        dracula.displayEnergy();

    }


}