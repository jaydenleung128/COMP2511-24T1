package video2;

import java.util.ArrayList;
import java.util.List;

import video2.States.ReadyState;
import video2.States.State;

// Please note that this code is incomplete and might not function properly
// The main takeaway for this code is to understand how to implement the State Pattern - how states transition to another state
public class VideoPlayer {
    private State currState = new ReadyState();
    private List<Video> playlist = new ArrayList<>();
    private boolean playing = false;
    public int currVideo = 0;

    public VideoPlayer(List<Video> playlist) {
        this.playlist = playlist;
    }

    public void onLocked() {
        currState.onLock(this);
    }

    public void onPlay() {
        currState.onPlay(this);
    }

    public void onNext() {
        currState.onNext(this);
    }

    public State getCurrState() {
        return currState;
    }

    public void setCurrState(State currState) {
        this.currState = currState;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public Video goNextVideo() {
        if (currVideo >= playlist.size()) return null;
        currVideo++;
        return playlist.get(currVideo);
    }
    
    public Video getCurrVideo() {
        return playlist.get(currVideo);
    }

    public static void main(String[] args) {
        List<Video> playlist = new ArrayList<>();
        Producer mrBeast = new Producer("MrBeast");
        playlist.add(new Video("100m sub video", 10, mrBeast));
        playlist.add(new Video("200m sub video", 10, mrBeast));

        VideoPlayer videoPlayer = new VideoPlayer(playlist);
        videoPlayer.onPlay();
        videoPlayer.onPlay();
    }

}
