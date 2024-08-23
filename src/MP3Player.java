import interfaces.AudioPlayer;

public class MP3Player implements AudioPlayer {

    @Override
    public void play(String audioType, String filename) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file: " + filename);
        } else {
            System.out.println("Invalid format. Cannot play file: " + filename);
        }
    }
}