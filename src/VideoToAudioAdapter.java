import interfaces.AudioPlayer;
import interfaces.VideoPlayer;

public class VideoToAudioAdapter implements AudioPlayer {

    private final VideoPlayer videoPlayer;

    public VideoToAudioAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        if ("mp4".equalsIgnoreCase(audioType)) {
            videoPlayer.playMp4(filename);
        } else if ("mkv".equalsIgnoreCase(audioType)) {
            videoPlayer.playMkv(filename);
        } else {
            System.out.println("Invalid format. Cannot play file: " + filename);
        }
    }
}