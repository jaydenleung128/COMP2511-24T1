package video2;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Observable o) {
        Producer p = (Producer)o;
        Video latestVid = p.getLatestVideo();
        System.err.println( name + latestVid.getName());
    }

    @Override
    public void subscribe(Observable o) {
        o.add(this);
    }

    public String getName() {
        return name;
    }
}
