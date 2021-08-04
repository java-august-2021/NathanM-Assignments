public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all it's methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Joe Rogan", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.answeringBeforeAlexis("Alexis! Play some low-fi beats.");

        String alfredTest = alfredBot.answeringBeforeAlexis("I can't find my Airpods. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.answeringBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
        // Print the greetings to test.
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}