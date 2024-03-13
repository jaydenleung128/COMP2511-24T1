package video2.States;

import video2.VideoPlayer;

public class PlayingState implements State {

    @Override
    public void onLock(VideoPlayer videoPlayer) {
        videoPlayer.setCurrState(new LockedState());
    }

    @Override
    public void onPlay(VideoPlayer videoPlayer) {
        videoPlayer.setPlaying(false);
        videoPlayer.setCurrState(new ReadyState());
    }

    @Override
    public void onNext(VideoPlayer videoPlayer) {
        videoPlayer.goNextVideo();
    }
    
}
