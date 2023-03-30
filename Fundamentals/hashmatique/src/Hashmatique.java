import java.util.HashMap;

public class Hashmatique {
    HashMap<String, String> trackList = new HashMap<String, String>();
    void getSong(String titulo) {
        trackList.put("The Real Slim Shady","May I have your attention, please?\n" +
                "May I have your attention, please?\n" +
                "Will the real Slim Shady please stand up?\n" +
                "I repeat, will the real Slim Shady please stand up?…");
        trackList.put("Without me","Obie Trice, real name no gimmicks\n" +
                "Two trailer park girls go round the outside\n" +
                "Round the outside, round the outside\n" +
                "Two trailer park girls go round the outside…");
        trackList.put("Mockingbird","Yeah, I know sometimes\n" +
                "Things may not always make sense to you right now\n" +
                "But hey, what'd daddy always tell you?\n" +
                "Straighten up, little soldier…");
        trackList.put("Rap God","Look, I was gonna go easy on you not to hurt your feelings\n" +
                "But I'm only going to get this one chance (six minutes-, six minutes-)\n" +
                "Something's wrong, I can feel it (six minutes, Slim Shady, you're on!)\n" +
                "Just a feeling I've got, like something's about to happen, but I don't know what…");
        System.out.println(trackList.get(titulo));
    }
}
