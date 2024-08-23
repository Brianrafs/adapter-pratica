import interfaces.VideoPlayer;

public class MKVPlayer implements VideoPlayer {

    @Override
    public void playMkv(String filename) {
        System.out.println("Playing mkv file: " + filename);
    }

    @Override
    public void playMp4(String filename) {
    }
}