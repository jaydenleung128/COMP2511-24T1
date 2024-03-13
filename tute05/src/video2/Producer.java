package video2;

import java.util.ArrayList;
import java.util.List;

public class Producer extends Observable {
    private String name;
    private List<Video> videos = new ArrayList<>();
    
    public Producer(String name) {
        this.name = name;
    }

    public void postVideo(Video v) {
        videos.add(v);
        notifies();
    }

    public List<Video> getVideos() {
        return new ArrayList<>(videos); // So we don't return a pointer -> violates encapsulation
    }

    public Video getLatestVideo() {
        return videos.get(videos.size() - 1);
    }

    public static void main(String[] args) {
        Producer mrBeast = new Producer("Mr Beast");
        User jayden = new User("Jayden");

        jayden.subscribe(mrBeast);

        Video v = new Video("100m Sub Video", 10, mrBeast);
        mrBeast.postVideo(v);

        User jess = new User("Jess");
        jess.subscribe(mrBeast);

        Video v2 = new Video("200m Sub Video", 10, mrBeast);
        mrBeast.postVideo(v2);

    }
}
