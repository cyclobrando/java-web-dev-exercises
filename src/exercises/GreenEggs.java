package exercises;
import java.util.Arrays;

public class GreenEggs {
    public static void main(String[] args) {
        String lyric = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] lyricArray = lyric.split("\\.");
        System.out.println(Arrays.toString(lyricArray));
    }
}
