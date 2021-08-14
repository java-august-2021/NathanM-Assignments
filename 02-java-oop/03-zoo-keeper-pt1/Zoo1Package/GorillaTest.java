public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gor = new Gorilla(100);
        //throw 3 times
        gor.throwSomething();
        gor.throwSomething();
        gor.throwSomething();
        //eat 2 times
        gor.eatBanana();
        gor.eatBanana();
        //climb once
        gor.climbTree();
        //display energy level of 95
        gor.displayEnergy();
    }
}
