package video2.States;

import video2.VideoPlayer;

public interface State {
    public void onLock(VideoPlayer videoPlayer);    
    public void onPlay(VideoPlayer videoPlayer);    
    public void onNext(VideoPlayer videoPlayer);    
}
