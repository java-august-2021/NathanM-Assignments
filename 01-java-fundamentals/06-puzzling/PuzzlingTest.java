import java.util.ArrayList;


public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling puzzle = new Puzzling();
//1.
        ArrayList<Integer> randomRolls = puzzle.getTenRolls();
        System.out.println(randomRolls);

//2-4
        System.out.println(puzzle.randomLetter());
        System.out.println(puzzle.genPassword());
        System.out.println(puzzle.newPassword(10));
    }
}