import java.util.HashMap;
import java.util.Set;

public class HashMapMusic{
    public static void main(String[] args) {
        HashMap<String, String> music = new HashMap<String, String>();
        music.put("Fireflies", "I'd like to make myself belieeeeeve, that planet earth moves slowly");
        music.put("Tik Tok", "Tik Tok on the clock lalalala");
        music.put("Go Hard", "DJ KHALED, WE DA BEST!");
        music.put("Baby Shark", "Baby Shark dodododododo");

        System.out.println(music.get("Baby Shark")); // print one specific track w lyrics
        //get keys using keySet method
        Set<String> lyrics = music.keySet();
        for(String track : lyrics) {
            System.out.println(track);
            System.out.println(music.get(track));
        }
    }
}


