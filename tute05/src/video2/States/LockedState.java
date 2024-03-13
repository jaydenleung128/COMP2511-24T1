package video2.States;

import javax.management.RuntimeErrorException;

import video2.VideoPlayer;

public class LockedState implements State {

    @Override
    public void onLock(VideoPlayer videoPlayer) {
        if (videoPlayer.isPlaying()) {
            videoPlayer.setCurrState(new PlayingState());
        } else {
            videoPlayer.setCurrState(new ReadyState());
        }
    }

    @Override
    public void onPlay(VideoPlayer videoPlayer) {
        throw new RuntimeErrorException(null, "Locked");
    }

    @Override
    public void onNext(VideoPlayer videoPlayer) {
        throw new RuntimeErrorException(null, "Locked");
    }
    
}
