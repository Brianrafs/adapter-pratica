import interfaces.AudioPlayer;
import interfaces.VideoPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        Winamp winamp = new Winamp(mp3Player);
        winamp.play("mp3", "song.mp3");

        VideoPlayer mp4Player = new MP4Player();
        AudioPlayer mp4Adapter = new VideoToAudioAdapter(mp4Player);
        winamp = new Winamp(mp4Adapter);
        winamp.play("mp4", "video.mp4");

        VideoPlayer mkvPlayer = new MKVPlayer();
        AudioPlayer mkvAdapter = new VideoToAudioAdapter(mkvPlayer);
        winamp = new Winamp(mkvAdapter);
        winamp.play("mkv", "movie.mkv");
    }
}