public class ProjectTest {
    public static void main(String[] args) {
        Project projectA = new Project();
        Project projectB = new Project("Chernobyl");
        Project projectC = new Project("Chernobyl", "A very unsuccessful project!");
    

        System.out.println(projectA.elevatorPitch());
        System.out.println(projectB.elevatorPitch());
        System.out.println(projectC.elevatorPitch());

}
}