import interfaces.VideoPlayer;

public class MP4Player implements VideoPlayer {

    @Override
    public void playMkv(String filename) {
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file: " + filename);
    }
}
