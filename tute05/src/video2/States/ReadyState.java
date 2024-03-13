package video2.States;

import video2.VideoPlayer;

public class ReadyState implements State {

    @Override
    public void onLock(VideoPlayer videoPlayer) {
        videoPlayer.setCurrState(new LockedState());
    }

    @Override
    public void onPlay(VideoPlayer videoPlayer) {
        videoPlayer.setPlaying(true);
        videoPlayer.setCurrState(new PlayingState());
    }

    @Override
    public void onNext(VideoPlayer videoPlayer) {
        videoPlayer.goNextVideo();
    }
    
}
